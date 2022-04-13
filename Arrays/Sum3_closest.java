/*
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
*/
import java.util.*;
public class Sum3_closest {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array n:");
        int n=sc.nextInt();
        System.out.println("Enter the target value:");
        int target=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(threeSumClosest(arr,target));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int closestSum=nums[0]+nums[1]+nums[nums.length-1];
        
        for(int i=0;i<nums.length-2;i++)
        {
            int low=i+1;
            int high=nums.length-1;
            while(low<high)
            {
                int currSum=nums[i]+nums[low]+nums[high];
                if(currSum>target)
                    high--;
                else
                    low++;
                if(Math.abs(currSum-target)<Math.abs(closestSum-target))
                    closestSum=currSum;
            }
        }
        return closestSum;
    }

    
}
