/*Print all possible subarray of the given array
example:
Input:
3
-1,4,7
Output:
-1
-1 4
-1 4 7
4
4 7
7

*/
#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
      cin>>arr[i];
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++)
        {
            for(int k=i;k<=j;k++)
                cout<<arr[k]<<" ";
            cout<<endl;
        }
    }
    return 0;
}