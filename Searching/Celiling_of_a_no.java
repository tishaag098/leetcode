/*
In an array find the greatest number that is smaller than or equal to target.
Assume that the array is in sorted order(non-decreasing)

Example:
input: [2,3,5,6,14,16,18]  target:15
output: 5  ----->returning the index of 16

example2:
input:[5 7 13 14 80]    target=14
output:3 ------>index of 14
*/
import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class Celiling_of_a_no {
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
        int res=ceiling(arr, n, target);
        System.out.println(res);
    }
    public static int ceiling(int arr[],int n,int target)
    {
        if(target>arr[arr.length-1])
             return -1;

        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(target<arr[mid])
                end=mid-1;
            else if(target>arr[mid])
                start=mid+1;
            else
                return mid;  //ans found
        }
        return start;//at the end of the while loop start will point to the smallest no grater than target
    }
}
