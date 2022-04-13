//-------------Asked in many companies-------------------------
/*Given an array nums with n objects colored red, white, or blue, 
sort them in-place so that objects of the same color are adjacent, 
with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]
*/

//Counting method
/*#include<iostream>
using namespace std;
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
    int cout0=0;
    int cout1=0;
    int cout2=0;

    for(int i=0;i<n;i++)
    {
        if(arr[i]==0)
           cout0++;
        else if(arr[i]==1)
           cout1++;
        else
           cout2++;
    }

        int k=0;
        while(cout0--)
        {
            arr[k++]=0;
        }
        while(cout1--)
        {
            arr[k++]=1;
        }
        while(cout2--)
        {
            arr[k++]=2;
        }
    
    for(int k=0;k<n;k++)
    {
        cout<<arr[k]<<" ";
    }
    return 0;
}*/

//Dutch National Flag Alogrithms(most efficient)
#include<iostream>
using namespace std;
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
    int i,j,k;
    i=j=0;
    k=n-1;
    while(j<=k)
    {
        switch(arr[j])
        {
            case 0:swap(arr[i++],arr[j++]);break;
            case 1:j++;break;
            case 2:swap(arr[j],arr[k--]);break;
        }
    }
    for(int k=0;k<n;k++)
    {
        cout<<arr[k]<<" ";
    }
    return 0;
}