//----------------Google,Amazon,FAcebook,Visa---------------------------------
/*Given an unsorted array A of size N of non-negative integers, find a continuous
subarray which adds to a given number S.

Constraints
1 <= N <= 10^5
0 <= Ai <= 10^10

Example
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements from 2nd position to 4th position is 12.*/

// #include<iostream>
// using namespace std;
// int main()
// {
//     int n,S;
//     cin>>n>>S;
//     int arr[n];
//     for(int i=0;i<n;i++)
//       cin>>arr[i];
//       int sum=0;
//     for(int i=0;i<n-1;i++)
//     {
//         for(int j=i;j<n;j++)
//         {
//             sum+=arr[j];
//             if(sum==S)
//               {
//                   cout<<i<<j<<endl;
//                   break;
//               }

//         }
//     }
//     return 0;
// }

#include<iostream>
using namespace std;
int main()
{
    int n,S;
    cin>>n>>S;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    int i=0,j=0,sum=0;
    while(j<n && sum+arr[j]<=S)
    {
        sum+=arr[j];
        j++;
    }
    if(sum==S){
        cout<<i+1<<" "<<j<<endl;
    }
    while(j<n)
    {
        sum+=arr[j];
        while(sum>S)
        {
            sum-=arr[i];
            i++;
        }
        if(sum==S)
           break;
        j++;
    }
    cout<<i+1<<" "<<j+1<<endl;
    return 0;
}