/*
Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

Example 1:
Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest
 contiguous subarray with an equal number of 0 and 1.

 */
import java.util.*;
class Continuous_Array{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array n:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=findMaxLength(arr, n);
        System.out.println(res);
    }
    public static int findMaxLength(int[] nums,int n) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int sum=0,max_length=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                sum+=-1;
            else if(nums[i]==1)
                sum+=+1;
            
            if(hm.containsKey(sum))
            {
                int idx=hm.get(sum);
                int len=i-idx;
                max_length=Math.max(len,max_length);
            }
            else
                hm.put(sum,i);   
                
        }
        return max_length;
        
    }
}