/*
Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.

Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows

a, b are from arr
a < b
b - a equals to the minimum absolute difference of any two elements in arr
 
Example 1:
Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.

Example 2:
Input: arr = [1,3,6,10,15]
Output: [[1,3]]
Example 3:

Input: arr = [3,8,-10,23,19,-4,-14,27]
Output: [[-14,-10],[19,23],[23,27]]

*/
import java.util.*;
public class Min_Absolute_diff {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of teh array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> res=new ArrayList<>();
        res=minimumAbsDifference(arr);
        System.out.println(res);
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        
       for(int i=1;i<arr.length;i++)
             min=Math.min(min,arr[i]-arr[i-1]);
        
       for(int i=1;i<arr.length;i++)
       {
           int diff=arr[i]-arr[i-1];
           if(diff==min)
           {
               List<Integer> pair=new ArrayList<>(2);
               pair.add(arr[i-1]);
               pair.add(arr[i]);
               list.add(pair);
           }
       }
        return list;
        
    }
}




