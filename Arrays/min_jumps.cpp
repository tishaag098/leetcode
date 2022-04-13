/*--------------------Accolite,Amazon-------------------------------------------------------
You are given a number n, representing the number of stairs in a staircase.
You are on the 0th step and are required to climb to the top.
You are given n numbers, where ith element's value represents - till how far from the step you could jump to in a single move. 
You are required to print the number of minimum moves in which you can reach the top of the staircase.
Example:
Array:[1,3,5,8,9,2,6,7,6,8,9]
Output:
3
-------------------------Simple but important question---------------------------------
*/

#include<iostream>
using namespace std;

//---------------------------Time comp:O(n^2)-----------------------------------
// int minJumpsDP(int arr[],int n)
// {
//     int jumps[n];
//     for(int i=0;i<n;i++)
//     {
//         jumps[i]=INT_MAX;
//     }
//     jumps[0]=0;
//     for(int i=0;i<n;i++)
//     {
//         for(int j=0;j<i;j++)
//         {
//             if(i<=j+arr[j])
//             {
//                 jumps[i]=min(jumps[i],jumps[j]+1);
//             }
//         }
//     }
//     if(jumps[n-1]<0 || (jumps[n-1]==INT_MAX))
//     {
//         return -1;
//     }
//     return jumps[n-1];
// }

//---------------------------Time comp:O(n)-----------------------------
int minJumps(int arr[],int n)
{
    int jumps=0;
    int maxReach=0;
    int currEnd=0;

    for(int i=0;i<n;i++)
    {
        maxReach=max(maxReach,i+arr[i]);

        if(maxReach>=n-1)
          return 1+jumps;
        
        if(i==maxReach)
           return -1;
        
        if(i==currEnd)
        {
            jumps++;
            currEnd=maxReach;
        }
    }
    return jumps;
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
    int result=minJumps(arr,n);
    cout<<result<<endl;
    return 0;
}