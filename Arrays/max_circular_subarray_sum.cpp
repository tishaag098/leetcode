//-------------------------------Visa,Amazon,Flipkart,Samsung,Goggle----------------------
//Find the maximum sum circular subarray

/*
#include<iostream>
#include<climits>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    int max_straight_sum=INT_MIN;
    int min_straight_sum=INT_MAX;
    int arr_sum=0;

    int temp_maxSum=0;
    int temp_minSum=0;

    for(int i=0;i<n;i++)
    {
        arr_sum+=arr[i];

        temp_maxSum+=arr[i];
        max_straight_sum=max_straight_sum<temp_maxSum ? temp_maxSum:max_straight_sum;
        temp_maxSum=temp_maxSum<0?0:temp_maxSum;

        temp_minSum+=arr[i];
        min_straight_sum=min_straight_sum>temp_minSum ? temp_minSum:min_straight_sum;
        temp_minSum=temp_minSum>0?0:temp_minSum;
    }

        if(arr_sum==min_straight_sum)//if all the ele of the array are negative
           cout<<max_straight_sum;
        else
        {
             cout<<max(max_straight_sum,(arr_sum-min_straight_sum))<<endl;
        }
          

    return 0;
}
*/

//More Efficient method
#include<iostream>
#include<climits>
using namespace std;

int kadane(int arr[],int n)
{
    int currSum=0;
    int maxSum=INT_MIN;
    for(int i=0;i<n;i++)
    {
        currSum+=arr[i];
        if(currSum<0)
            currSum=0;
        maxSum=max(currSum,maxSum);
    }
    return maxSum;
}
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    int wrapsum;
    int nonwrapsum;

    nonwrapsum=kadane(arr,n);
    int arrSum=0;

    for(int i=0;i<n;i++)
    {
        arrSum+=arr[i];
        arr[i]=-arr[i];//reversing the sign of all the elments of the array
    }
    wrapsum=arrSum-(-kadane(arr,n));
    cout<<max(wrapsum,nonwrapsum)<<endl;


    return 0;
}
