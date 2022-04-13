/*Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at onr side of array
Example:
5
1 2 -4 -7 -5
output:
-4 -7 -5 2 1
*/

#include<iostream>
using namespace std;
/* 

void shiftAll(int arr[],int n)
{
    int left=0;
    int right=n-1;
    while(left<=right)
    {
        if(arr[left]<0 && arr[right]<0)
            left++;
        else if(arr[left]>0 && arr[right]<0)
            swap(arr[left++],arr[right--]);
        else if(arr[left]>0 && arr[right]>0)
            right--;
        else
            {
                left++;
                right--;
            }
    }
}
*/
void shiftAll(int arr[],int n)
{
    int j=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]<0)
        {
            if(i!=j)
              swap(arr[i],arr[j]);
            j++;
        }
    }
}
int main()
{
    int n;
    cout<<"Enter the size of the element: ";
    cin>>n;
    int arr[n];
    cout<<"Enter the elements of n sized array: ";
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    shiftAll(arr,n);
    for(int k=0;k<n;k++)
    {
        cout<<arr[k]<<" ";
    }
    return 0;
}
