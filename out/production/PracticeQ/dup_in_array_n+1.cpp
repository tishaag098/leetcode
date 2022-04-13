/*-------------------------------------------Askeed in many companies-----------------------------------------------------------
Given an array of integers nums containing n + 1 integers 
where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

Constraints:
1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times. 

Example 1:
Input: nums = [1,3,4,2,2]
Output: 2

Example 2:
Input: nums = [3,1,3,4,2]
Output: 3
*/
#include<bits/stdc++.h>
using namespace std;

/*------naive approach---------------
-------Time comp: O(nlogn)-----------
void dup(int arr[],int n)
{
    sort(arr,arr+n);
    for(int i=0;i<n-1;i++)
    {
         if(arr[i]==arr[i+1])
            {
                cout<<arr[i]<<endl;
                break;
            }
    }
}

---------------------Time Complexity: O(N)---------------------------------
--------------Space Complexity: O(N), as we are using extra space for frequency array.----------------------------
void dup(int arr[],int n)
{
    int feq[n+1]={0};
    for(int i=0;i<n;i++)
    {
        if(feq[arr[i]]==0)
           feq[arr[i]]+=1;
        else
           cout<<arr[i];
    }
}
*/
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
    dup(arr,n); 
    return 0;
}