/*---------------------------------- Amazon Walmart Microsoft---------------------------------------
Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
 
Example 1:
Input:
N = 7
a[] = {2,6,1,9,4,5,3}
Output:
6
Explanation:
The consecutive numbers here
are 1, 2, 3, 4, 5, 6. These 6 
numbers form the longest consecutive
subsquence.
*/
import java.util.*;
class LongestConsecutiveSeq{
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
        System.out.println(findLongestConseqSubseq(arr,n));
    }
    static int findLongestConseqSubseq(int arr[], int n)
    {
        //creating hashSet to remove duplicacy
        HashSet<Integer> st=new HashSet<>();

        for(int i=0;i<n;i++)
            st.add(arr[i]);
        
        int ans=0,c=1;
        for(int i=0;i<n;i++)
        {
            c=1;
            if(!st.contains(arr[i]-1))
            {
                int val=arr[i]+1;
                while(st.contains(val))
                {
                    val++;
                    c++;
                }
                ans=Math.max(ans,c);
            }
        }
        return ans;
    }
}