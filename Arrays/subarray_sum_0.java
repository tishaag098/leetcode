/*---------------------------- Paytm Adobe------------------------------
Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.

Example 1:
Input:
5
4 2 -3 1 6
Output: 
Yes
Explanation: 
2, -3, 1 is the subarray 
with sum 0.
*/
import java.util.*;
public class subarray_sum_0 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(subArrayExists(arr, n));

    }
    // Brute force approach-----------------Time limit exceeded: O(n^2)------------------------------
    /*
    public static boolean subArrayExists(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum==0)
                  return true;
                
            }
        }
        return false;
    }
    */
    public static boolean subArrayExists(int arr[],int n)
    {
         //declare a set data structure
         HashSet<Integer> res=new HashSet<>();
         int sum=0;
         
         for(int i=0;i<n;i++)
         {
             res.add(sum);//in first step it will add 0
             sum+=arr[i];
             if(res.contains(sum))
                 return true;
         }
         return false;

    }
   

    
}
