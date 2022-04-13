/* Amazon Amdocs Brocade FactSet Goldman Sachs Juniper Networks Linkedin Microsoft Quikr Snapdeal Synopsys Visa Zoho

Given two sorted arrays arr1[] of size N and arr2[] of size M.
Each array is sorted in non-decreasing order. 
Merge the two arrays into one sorted array in non-decreasing order without using any extra space.

Example 1:
Input:
N = 4, M = 5
arr1[] = {1, 3, 5, 7}
arr2[] = {0, 2, 6, 8, 9}
Output: 0 1 2 3 5 6 7 8 9
Explanation: Since you can't use any 
extra space, modify the given arrays
to form 
arr1[] = {0, 1, 2, 3}
arr2[] = {5, 6, 7, 8, 9}
*/
#include<bits/stdc++.h>
using namespace std;
/*--------------------------------------Its taking extra space-------------------------------------------
void merge(int arr1[],int arr2[],int n,int m,int res[])
{
    int i,j,k;
    i=j=k=0;
    while(i<n && j<n)
    {
        if(arr1[i]<arr2[j])
        {
            res[k++]=arr1[i];
            i++;
        }
        else 
         {
             res[k++]=arr2[j];
             j++;
         }
    }
    while(i<n)
    {
        res[k++]=arr1[i];
        i++;
    }
    while(j<m)
    {
        res[k++]=arr2[j];
        j++;
    }
}*/

void mergeWithoutExtraSpace(int arr1[],int arr2[],int n,int m)
{
    int i=0,j=0,k=n-1;
    while(i<=k &&j<m)
    {
        if(arr2[j]<arr1[i])
        {
            swap(arr2[j++],arr1[k--]);
        }
        else
        {
            i++;
        }
    }
    sort(arr1,arr1+n);
    sort(arr2,arr2+m);
}
int main()
{
    int n,m;
    cout<<"Enter the size of 1st array n: ";
    cin>>n;
    int arr1[n];
    cout<<"Enter the elements of n sized array: ";
    for(int i=0;i<n;i++)
    {
        cin>>arr1[i];
    }
     cout<<"Enter the size of 2nd array m: ";
    cin>>m;
    int arr2[m];
    cout<<"Enter the elements of m sized array: ";
    for(int i=0;i<m;i++)
    {
        cin>>arr2[i];
    }
    //int res[(n+m)];
    //merge(arr1,arr2,n,m,res);
    // for(int i=0;i<n+m;i++)
    // {
    //     cout<<res[i]<<" ";
    // }
    mergeWithoutExtraSpace(arr1,arr2,n,m);
    for(int i=0;i<n;i++)
       cout<<arr1[i]<<" ";
    for(int i=0;i<m;i++)
       cout<<arr2[i]<<" ";
    return 0;
}