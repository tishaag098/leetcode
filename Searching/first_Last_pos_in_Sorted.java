/*-----------------------------------FAcebook-------------------------------
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
*/
import java.util.*;
public class first_Last_pos_in_Sorted {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.print("Enter the target value: ");
        int target=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] res=new int[2];
         res=searchRange(arr, target);
         for(int i=0;i<2;i++)
             System.out.print(res[i] + " ");
    }
    //-----------------------------Brute force------------------------------------------------
    /*
    public static int[] searchRange(int[] nums, int target) {
        
        int[] pos={-1,-1};
        
        int i=0;
        int j=nums.length-1;
        
        while(i<nums.length)
        {
            if(nums[i]==target)
            {
               pos[0]=i;
               break;
            }
            i++;
        }
         while(j>=0)
        {
            if(nums[j]==target)
            {
               pos[1]=j;
               break;
            }
            j--;
        }
        return pos;
    }
    */
    //---------------------------Using binary search---------------------------------------------------
    public static int[] searchRange(int[] nums, int target) {
        
        int[] ans={-1,-1};
        ans[0]=searchTarget(nums,target,true);
        if(ans[0]!=-1)
            ans[1]=searchTarget(nums,target,false);
           
        return ans;
    }
    
    static int searchTarget(int nums[],int target,boolean isStart)
    {
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
            if(target<nums[mid])
                end=mid-1;
            else if(target>nums[mid])
                start=mid+1;
            else
            {
                ans=mid;
                if(isStart)
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return ans;
    }
}
