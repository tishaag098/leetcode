/*
Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

Example 1:

Input:
N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}
Output: 6
Explanation: The minimum difference between 
maximum chocolates and minimum chocolates 
is 9 - 3 = 6 by choosing following M packets :
{3, 4, 9, 7, 9}.
*/

import java.util.*;
public class ChocolateDistri {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array n:");
        int n=sc.nextInt();
        System.out.println("Enter the value of m:");
        int m=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array a1:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        findMinDiff(arr, n, m);
    }
    public static void findMinDiff (int a[], int n, int m)
    {
        long ans=Long.MAX_VALUE;
        Arrays.sort(a);
        // your code here
        for(int i=0;i<=n-m;i++)
        {
            long min=a[i];
            long max=a[i+m-1];
            long gap=max-min;
            if(gap<ans)
               ans=gap;
        }
        System.out.println(ans);
    }

    
}
