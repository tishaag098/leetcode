/*
https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/

You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.

Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.

Return the minimum possible difference.

Example 1:

Input: nums = [90], k = 1
Output: 0
Explanation: There is one way to pick score(s) of one student:
- [90]. The difference between the highest and lowest score is 90 - 90 = 0.
The minimum possible difference is 0.
Example 2:

Input: nums = [9,4,1,7], k = 2
Output: 2
*/
import java.util.*;
public class Min_diff_bt_highest_lowest {
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
        System.out.println(minimumDifference(arr,k));
    }
    public static int minimumDifference(int[] nums, int k) {
        if(nums.length<=1 || k==1)
            return 0;
        
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i+k-1<nums.length;i++)
        {
            if(nums[k+i-1] -nums[i]<min)
            {
                min=nums[k+i-1]-nums[i];
            }
        }
        return min;
        
    }
}
