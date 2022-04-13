/*
A peak element is an element that is strictly greater than its neighbors.

Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞.

You must write an algorithm that runs in O(log n) time.

Example 1:
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.

Example 2:
Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
*/
import java.util.*;
public class Peak_ele {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(findPeakElement(arr));
    }
    //-----------------Binary search O(log n)-----------------------------------------
    public static int findPeakElement(int[] nums) {
        
        int start=0;
        int end=nums.length-1;
        
        while(start<end)
        {
            int mid=start+(end-start)/2;
            
            if(nums[mid]>nums[mid+1])
                end=mid;
            else
                start=mid+1; 
        }
        return start;//we can return either start or end coz both are equal
    }

}
