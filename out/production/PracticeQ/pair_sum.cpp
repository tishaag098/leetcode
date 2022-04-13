//check if there exits two ele in tan areay that thier sum is eqaual to given k
//Input:
// 8 31  (n=8,k=31)
// 2 4 7 11 14 16 20 21
// Output:
// 3 6
// pair found

#include<iostream>
using namespace std;

/*
bool pairsum(int arr[],int n,int k)
{
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]+arr[j]==k){
                cout<<i<<" "<<j<<endl;
                return true;
            }
        }
    }
    return false;
}*/
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

//this func only works when the array is sorted
bool pairsum(int arr[],int n,int k)
{
    int low=0;
    int high=n-1;

    while(low<high)
    {
        if(arr[low]+arr[high]==k){
           cout<<low<<" "<<high<<endl;
           return true;}
        else if(arr[low]+arr[high]>k)
            high--;
        else
            low++;
    }
    return false;
}
int main()
{
    int n,k;
    cin>>n>>k;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    bubbleSort(arr,n);
    if(pairsum(arr,n,k))
        cout<<"pair found"<<endl;
    else
        cout<<"pair not found"<<endl;
     
    
    return 0;
}