//----------------Google,Amazon,FAcebook,Visa---------------------------------
/*Given an unsorted array A of size N of non-negative integers, find a continuous
subarray which adds to a given number S.

Constraints
1 <= N <= 10^5
0 <= Ai <= 10^10

Example
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements from 2nd position to 4th position is 12.*/

//-------------------------java program : done on gfg brute force but time limit exceeded---------------------------------------

// static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
//     {
//         // Your code here
//         for(int i=0;i<n;i++)
//         {
//             int sum=0;
//             for(int j=i;j<n;j++)
//             {
//                 sum+=arr[j];
//                 if(sum==s)
//                   return new ArrayList<Integer> (Arrays.asList(i+1,j+1));
//             }
//         }
//         return new ArrayList<Integer> (Arrays.asList(-1));
//     }
// }
//-----------------------------------------------------------------------------------------------------------------------------------------
#include<iostream>
using namespace std;
int main()
{
    int n,S;
    cin>>n>>S;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    int i=0,j=0,sum=0;
    while(j<n && sum+arr[j]<=S)
    {
        sum+=arr[j];
        j++;
    }
    if(sum==S){
        cout<<i+1<<" "<<j<<endl;
    }
    while(j<n)
    {
        sum+=arr[j];
        while(sum>S)
        {
            sum-=arr[i];
            i++;
        }
        if(sum==S)
           break;
        j++;
    }
    cout<<i+1<<" "<<j+1<<endl;
    return 0;
}
//---------------------------------in java: easy to understand---------------------------------------------------------
static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int l = 0;
        int r = 1;
        int sum = arr[l];
        while (l <n) {
            if (sum == s) {
                list.add(++l);
                list.add(r);
                break;
            }
            if (sum < s && r<n ) {
                sum += arr[r];
                r++;
            } else {
                sum -= arr[l];
                l++;
            }

        }
        if(list.isEmpty()){
            list.add(-1);
        }
        return list;
    }