//Maximum subarray sum

//Naive approach
// #include<iostream>
// #include<climits>
// using namespace std;
// int main()
// {
//     int n;
//     cin>>n;
//     int arr[n];
//     for(int i=0;i<n;i++)
//       cin>>arr[i];
//     int maxSum=INT_MIN;
//     for(int i=0;i<n;i++)
//     {
//         for(int j=i;j<n;j++)
//         {
//             int sum=0;
//             for(int k=i;k<=j;k++)
//                 sum+=arr[k];
//             maxSum=max(sum,maxSum);
//         }
//     }
//     cout<<maxSum<<endl;
//     return 0;
// }

//Kadane Algorithm 
//Time complexity: O(N)

#include<iostream>
#include <climits>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    cin>>arr[i];

   int currSum=0;
   int maxSum=INT_MIN;
   for(int i=0;i<n;i++)
   {
       currSum+=arr[i];
       if(currSum<0)
           currSum=0;
       maxSum=max(maxSum,currSum);
   }
   cout<<maxSum<<endl;
    return 0;
}
