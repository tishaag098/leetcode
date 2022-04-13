/* ----------------------------------Amazon------------------------------------------
Given an array of positive and negative numbers, arrange them in an alternate fashion such that every positive number is followed by negative and vice-versa maintaining the order of appearance. 
Number of positive and negative numbers need not be equal. If there are more positive numbers they appear at the end of the array. If there are more negative numbers, they too appear in the end of the array.

Examples : 

Input:  arr[] = {1, 2, 3, -4, -1, 4}
Output: arr[] = {-4, 1, -1, 2, 3, 4}

Input:  arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
output: arr[] = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0}
*/
import java.util.*;
public class RearrangeArrayInAlterPos {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        reArrange(arr, n);
    }
    //doing right rotate to shift the elements to the right
    //this is done to maintain the order of the elements
    public static void rotate(int arr[],int start,int end)
    {
        int temp=arr[end];
        for(int i=end-1;i>=start;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[start]=temp;
    }
    public static void reArrange(int arr[],int n)
    {
        int i=0,j=0,k=0;
        while(i<n && j<n && k<n)
        {
            if(k%2==0)//if k is even
            {
                if(arr[k]>=0)
                {
                    i=k; j=k;
                    while(i<n && arr[i]>=0)
                       i++;
                    if(i>=n) break;
                    else
                       rotate(arr,j,i);
                }
            }
            else{
                if(arr[k]<0)
                {
                    i=k;
                    j=k;
                    while(j<n && arr[i]<0)
                       j++;
                    if(j>=n) break;
                    else
                    rotate(arr,i,j);
                }
            }
            k++;

        }
        for(int l=0;l<n;l++)
           System.out.print(arr[l]+" ");

    }
    
}
