/* ------------------------Amazon D-E-Shaw Microsoft Morgan Stanley OYO Rooms Google------------------------------------
Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

Example 1:
Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is [6, -3, -10] which gives product as 180.

Example 2:
Input:
N = 6
Arr[] = {2, 3, 4, 5, -1, 0}
Output: 120
Explanation: Subarray with maximum product
is [2, 3, 4, 5] which gives product as 120.
*/
import java.util.*;
public class max_Product_Subarray {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(maxProduct(arr,n));
    }
    static long maxProduct(int[] arr, int n) {
        // code here
        long max=arr[0];
        long min=arr[0];
        long res=arr[0];
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]==0)
            {
                max=1;
                min=1;
                continue;
            }
            long temp1=arr[i]*max;
            long temp2=arr[i]*min;
            max=Math.max(temp1,temp2);
            max=Math.max(max,arr[i]);
            min=Math.min(temp1,temp2);
            min=Math.min(min,arr[i]);
            res=Math.max(max,res);
        }
        return res;
    }

    
}
