/*
https://leetcode.com/problems/maximum-average-subarray-i/

You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

Example 1:
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

Example 2:
Input: nums = [5], k = 1
Output: 5.00000
*/
import java.util.*;
public class max_avg_subarray {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();
        System.out.println("Enter the elements of teh array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(findMaxAverage(arr,k));
    }
    //using sliding window 
    public static double findMaxAverage(int[] nums, int k) {
        
        int i=0,j=0;
        double sum=0;
        double max_sum=Integer.MIN_VALUE;
        while(j<nums.length)
        {
            sum+=nums[j];
            if(((j-i)+1)==k)
            {
                
                max_sum=Math.max(max_sum,sum);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return max_sum/k;
    }
}
