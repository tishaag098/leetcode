/*----------------------------------amazon,microsoft------------------------------------------
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

Example 1:
Input: nums = [1,3,4,2,2]
Output: 2

Example 2:
Input: nums = [3,1,3,4,2]
Output: 3
*/

import java.util.*;
public class find_dup_no {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elemnts of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        

        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex])
            {
                swap(nums,i,correctIndex);
            }
            else
                i++;
        }
         return nums[nums.length-1]; 
    }
     public static  void  swap(int arr[],int j,int m)
    {
        int temp=arr[j];
        arr[j]=arr[m];
        arr[m]=temp;
    }
}
