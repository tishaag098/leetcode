/*A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are considered permutations of arr: [1,2,3], [1,3,2], [3,1,2], [2,3,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.

Example 2:
Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
 
Constraints:
1 <= nums.length <= 100
0 <= nums[i] <= 100
-------------------------------Level:Medium------------------
*/
//--------------------------time comp:O(n)---------------------------
//--------------------------Space comp:(1)------------------------------
import java.util.*;
public class Next_permutation {
    public static void main(String[] args)
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
        int i=arr.length-2;
        int j=0;
        while(i>=0 && arr[i]>=arr[i+1])
        {
            i--;
        }
        if(i>=0)
        {
            j=arr.length-1;
            while(arr[j]<=arr[i])
            {
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,arr.length-1);
        display(arr, n);
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverse(int arr[],int i,int j)
    {
        while(i<j)
        {
            swap(arr,i++,j--);
        }

    }
    public static void display(int arr[],int n)
    {
        System.out.println("Next Permutation is: ");
        for(int i=0;i<n;i++)
           System.out.print(arr[i]+" ");
    }
}
