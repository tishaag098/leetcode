/*------------------------------ Accolite Adobe Amazon FactSet Flipkart Goldman Sachs Hike MakeMyTrip Salesforce------------------------
Given an array of N integers, and an integer K,
 find the number of pairs of elements in the array whose
  sum is equal to K.

Example 1:

Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation: 
arr[0] + arr[1] = 1 + 5 = 6 
and arr[1] + arr[3] = 5 + 1 = 6.
*/
import java.util.*;

public class CountPairs_G_Sum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        System.out.print("Enter the value of k: ");
        int k=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=getPairsCount(arr, n, k);
        System.out.println(res);
    }

    public static int getPairsCount(int arr[],int n,int k)
    {
        int c=0;//counter
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<k)
            {
                int element=k-arr[i];
                if(hm.containsKey(element))
                {
                    c+=hm.get(element);
                }
                if(hm.get(arr[i])==null)//if element is not present in the HashMap
                {
                    hm.put(arr[i],0);
                }
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        return c;
    }
    
}
