//---------------------------------amazon,samsung,snapdeal-----------------------------------------
//Find the smallest positive missing number in the given array.
//Example: [0, -10, 1, 3, -20], Ans = 2
//contrains:
//1<=N<=10^6
//-10^6<=Ai<=10^6

#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
      cin>>arr[n];
    
    const int N=1e6+2;
    int idx[N];
    for(int i=0;i<N;i++)
      idx[i]=0;//initialising all the ele of idx array with 0
    for(int i=0;i<n;i++)
    {
        if(arr[i]>=0)
           idx[arr[i]+1]=1;
    }
    int ans=-1;
    for(int i=1;i<N;i++)
    {
        if(idx[i]==0)
          {
              ans=i;
              break;
          }
    }
    cout<<ans<<endl;
    return 0;
}