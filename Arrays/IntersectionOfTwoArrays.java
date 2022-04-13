/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
*/

import java.util.*;
public class IntersectionOfTwoArrays {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array nums1: ");
        int n=sc.nextInt();
        int[] nums1=new int[n];
        System.out.print("Enter the elements of array nums1: ");
        for(int i=0;i<n;i++)
          nums1[i]=sc.nextInt();
          System.out.print("Enter the size of array nums2: ");
        int m=sc.nextInt();
          int[] nums2=new int[n];
        System.out.print("Enter the elements of array nums2: ");
        for(int i=0;i<m;i++)
          nums2[i]=sc.nextInt();

        intersect(nums1, nums2);
    }
    public static void intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++)
        {
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        int k=0;
        
        for(int i=0;i<nums2.length;i++)
        {
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0)
            {
                list.add(nums2[i]);
                 map.put(nums2[i],map.get(nums2[i])-1);
            }
               
        }
        int[] arr= new int[list.size()];
        int j=0;
        for(int ele: list)
            arr[j++]=ele;

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
