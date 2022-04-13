/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.

Example 1:
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
*/
import java.util.*;
public class no_smaller_than_current_no {
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
        int ans[]=new int[n];
        ans=smallerNumbersThanCurrent(arr);
        for(int i=0;i<n;i++)
          System.out.print(ans[i]+" ");
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res=new int[nums.length];
            for(int i=0;i<nums.length;i++)
            {
                int count=0;
                for(int j=0;j<nums.length;j++)
                {
                    if(j!=i && nums[i]>nums[j])
                       count++;      
                }
                res[i]=count;
            }
            return res; 
        }
    
}
