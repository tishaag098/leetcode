/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

*/
import java.util.*;
public class Sum3 {
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
        List<List<Integer>> res = new ArrayList<>();
        res=threeSum(arr);
        System.out.println(res);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> list = new HashSet<>();//used hashSet to avoid duplicate elements
        
        for(int i=0;i<nums.length-2;i++)
        {
            int low=i+1;
            int high=nums.length-1;
            
            while(low<high)
            {
                if(nums[low]+nums[high]+nums[i]==0)
                    list.add(Arrays.asList(nums[i],nums[low],nums[high--]));
                else if(nums[low]+nums[high]+nums[i]>0)
                    high--;
                else
                    low++;     
            }
        }
        return new ArrayList<>(list);
    }

    
}



