/*Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
Constraints:
1 <= N <= 105
1 <= arr[i] <= 105
1 <= K <= N
Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7.
*/
#include<bits/stdc++.h>
#include<queue>
using namespace std;

/*
void bubbleSort(int arr[],int n)
{
    for (int i = 0; i < n - 1; i++) {

        for (int j = i + 1; j < n; j++) {

            if (arr[i] > arr[j]) {
                //swapping with smallest element of array.
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
    }
}
*/
//----------------------------without using any sort technique--------------------------------------
int kth_smallest(int arr[],int k,int n)
{
    priority_queue<int> pq;//max heap by default in c++
    for(int i=0;i<k;i++)
    {
        pq.push(arr[i]);
    }
    for(int i=k;i<n;i++)
    {
        if(pq.top()>arr[i])
        {
            pq.pop();
            pq.push(arr[i]);
        }
    }
    return pq.top();
}
//--------------------------------------C++ soln not working-------------------------------------
// int kth_largest(int arr[],int k,int n)
// {
//     priority_queue<int> pq;
//     for(int i=0;i<k;i++)
//     {
//         pq.push(-arr[i]);//since max heap is by default so we put all the elements in -ve
//     }
//     for(int i=k;i<n;i++)
//     {
//         if(pq.top()<(-arr[i]))
//         {
//             pq.pop();
//             pq.push(-arr[i]);
//         }
//     }
//     return (-pq.top());
// }
//-------------------------------java soln to find kth largest--------------------------------
 /*
 public int KthLargest(int[] arr, int k) {
         PriorityQueue<Integer> pq=new PriorityQueue<>();// by default min heap
        
        for(int i=0;i<k;i++)
           pq.add(arr[i]);
           
        for(int i=k;i<arr.length;i++)
        {
            if(pq.peek()<arr[i])
              {
                  pq.poll();
                  pq.add(arr[i]);
              }
        }
        return pq.peek();
        
    }
    */
int main()
{
    int n,k;
    cout<<"Enter the size of the element: ";
    cin>>n;
    cout<<"Enter the kth element: ";
    cin>>k;
    int arr[n];
    cout<<"Enter the elements of n sized array: ";
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    //bubbleSort(arr,n);
   // cout<<k<<"th smallest no. is "<<arr[k-1]<<endl;
    //cout<<k<<"th largest no. is "<<arr[n-k]<<endl;
    int res1=kth_smallest(arr,k,n);
    int res2=kth_largest(arr,k,n);
    cout<<"Kth smallest element is: "<<res1<<endl;
    cout<<"Kth largest element is: "<<res2<<endl;

    return 0;
}