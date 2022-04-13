/* Accolite Amazon Samsung Snapdeal
You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array.

Example 1:

Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing 
number is 6.
*/

import java.util.*;
import java.util.HashSet;

public class Smallest_pos_missing_no {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       int res= smallest_pos(arr,n);
       System.out.println(res);
    }
    public static int smallest_pos(int arr[],int n)
    {
        HashSet<Integer> hash=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            hash.add(arr[i]);
        }
        for(int i=1;i<=n+1;i++)
        {
            if(!hash.contains(i))
            {
                return i;
            }
        }
        return -1;
        
    }
}
