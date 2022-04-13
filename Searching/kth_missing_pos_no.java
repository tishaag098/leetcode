/*
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Find the kth positive integer that is missing from this array.

Example 1:
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

Example 2:
Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.

Constraints:
1 <= arr.length <= 1000
1 <= arr[i] <= 1000
1 <= k <= 1000
arr[i] < arr[j] for 1 <= i < j <= arr.length
*/
import java.util.*;
public class kth_missing_pos_no {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.print("Enter the k value: ");
        int k=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=findKthPositive(arr,k);
        System.out.println(res);
    }
    //---------------------------Brute force approach-----------------------------------------------
    public static int findKthPositive(int[] arr, int k) {
        
        int[] temp=new int[2001];
        
        for(int ele : arr)
        {
            temp[ele]=1;
        }
        int j=0;
        int[] missingEle=new int[2001];
        for(int i=1;i<temp.length;i++)
        {
            if(temp[i]==0)
                missingEle[j++]=i;
        }
        return missingEle[k-1];
    }
}
