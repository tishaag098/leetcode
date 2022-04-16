/*-------------------------Google--------------------------------------------------
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2]
 
Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 
Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
*/
import java.util.*;
public class find_all_num_disappeared_in_array {
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
        List<Integer> al=new ArrayList<>();

        al=findDisappearedNumbers(arr);
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
        // System.out.println(Arrays.toString(arr));
    }

    //------------------using Hashset--------------------------------------------------
    //--------------time comp: O(n)------------------------------------------
    //-------------space comp: O(n)------------------------------------------------------
/*
    public static List<Integer> findDisappearedNumbers(int[] nums)
    {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!set.contains(i))
                list.add(i);
        }
        return list;
    }
    */
    //--------------------using Cyclic sort----------------------------------------
    //-------------time comp: O(n)------------------------------------
    //-------------space comp: O(1)---------------------------------------
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        
        ArrayList<Integer> list=new ArrayList<>();
        
        int i=0;
        while(i<nums.length)
        {
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex])
                swap(nums,i,correctIndex);
            else
                i++;
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
                list.add(j+1);
        }
        return list;
        
    }
     public static void swap(int arr[],int j,int m)
    {
        int temp=arr[j];
        arr[j]=arr[m];
        arr[m]=temp;
    }

}
