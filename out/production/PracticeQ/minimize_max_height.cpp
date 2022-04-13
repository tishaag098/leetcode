/*------------------------------Amazon,microsoft,facebook-----------------------
Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower either by increasing or decreasing them by K only once. After modifying, height should be a non-negative integer. 
Find out the minimum possible difference of the height of shortest and longest towers after you have modified each tower.
Example 1:

Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as 
{3, 3, 6, 8}. The difference between 
the largest and the smallest is 8-3 = 5.
*/
#include<bits/stdc++.h>
using namespace std;

int getMinDiff(int arr[],int n,int k)
{
    sort(arr,arr+n);
    int ans=arr[n-1]-arr[0];

    int smallest=arr[0]+k;
    int largest=arr[n-1]-k;
    int minn,maxx;
    for(int i=0;i<n-1;i++)
    {
        minn=min(smallest,arr[i+1]-k);

    }
    



}
int main()
{
    int n,k;
    cout<<"Enter the size of the element: ";
    cin>>n;
    cout<<"Enter the value of k";   
    cin>>k;
    int arr[n];
    cout<<"Enter the elements of n sized array: ";
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    getMinDiff(arr,n,k);
    return 0;
}