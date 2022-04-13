/* ----------------------------------Accolite Amazon CarWale OYO Rooms Samsung Microsoft
Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.


Example 1:

Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in 
the array sums up to 13.
*/

import java.util.*;
public class TripletSumInArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array n:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the sum X");
        int X=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean res=find3numM1(arr, n,X);
        boolean res2=find3numM2(arr, n,X);
        System.out.println(res);
        System.out.println(res2);
    }
    //-------------------------method 1------------------------------------------
    public static boolean find3numM1(int A[],int n,int X)
    {
        Arrays.sort(A);
        for(int i=0;i<n-2;i++)
        {
            int low=i+1;
            int high=n-1;
            while(low<high)
            {
                 if(A[i]+A[low]+A[high]==X)
                   return true;
                 else if(A[i]+A[low]+A[high]>X)
                   high--;
                 else
                   low++;
             
            }
        }
       return false;
    }
    //--------------------------------method 2----------------------------------------
    public static boolean find3numM2(int A[],int n,int X)
    {
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<n-2;i++)
        {
            
            int toFind=X-A[i];
            for(int j=i+1;j<n;j++)
            {
                if(st.contains(toFind-A[j]))
                   return true;
                st.add(A[j]);
            }
        }
        return false;
    }
}
