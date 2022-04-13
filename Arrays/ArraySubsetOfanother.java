/*
Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. 
Both the arrays can be sorted or unsorted. It may be assumed that elements in both array are distinct.
 
Example 1:
Input:
a1[] = {11, 1, 13, 21, 3, 7}
a2[] = {11, 3, 7, 1}
Output:
Yes
Explanation:
a2[] is a subset of a1[]
*/
import java.util.*;
public class ArraySubsetOfanother {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array n:");
        int n=sc.nextInt();
        int[] a1=new int[n];
        System.out.println("Enter the elements of the array a1:");
        for(int i=0;i<n;i++)
        {
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of the array m:");
        int m=sc.nextInt();
        int[] a2=new int[m];
        System.out.println("Enter the elements of the array a2:");
        for(int i=0;i<m;i++)
        {
            a2[i]=sc.nextInt();
        }
        System.out.println(isSubset(a1,a2,n,m));
    }
    public static String isSubset( int a1[], int a2[], int n, int m) {
        
        HashSet<Integer> st=new HashSet<>();
        
        for(int i=0;i<n;i++)
          st.add(a1[i]);
         
         for(int i=0;i<m;i++)
         {
             if(!st.contains(a2[i]))
                return "No";
         }
         return "Yes";
    }
    
}
