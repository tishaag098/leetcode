/*Given an array, rotate the array by one position in clock-wise direction.
 

Example 1:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
 */

#include<iostream>
using namespace std;
void shift(int arr[],int n)
{

    int temp=arr[n-1];
    for(int i=n-1;i>0;i--)
    {
        arr[i]=arr[i-1];
    }
    arr[0]=temp;
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
    shift(arr,n);
     for(int k=0;k<n;k++)
    {
        cout<<arr[k]<<" ";
    }
    return 0;
}