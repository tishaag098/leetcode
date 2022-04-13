/*
Find the only non-repeating element in an array where every element repeats twice

example:
input:[1,1,4,3,5,4,5]
output:3
*/
import java.util.*;
import java.util.HashMap;

public class Onenon_repeating_no {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        non_repeating(arr,n);
    }
    //-----------------time comp:O(n)--------------------------------
    //-----------------Space comp:O(1)--------------------------------
    static void non_repeating(int arr[],int n)
    {
        int res=0;
        for(int i=0;i<n;i++)
        {
            res=res^arr[i];//XOR
        }
        System.out.println(res);
    }
    //----------------------------------NOT WORKING--------------------------------
    // static void non_repeating(int arr[],int n)
    // {
    //     HashMap<Integer,Integer> hm=new HashMap<>();
    //     for(int i=0;i<n;i++)
    //     {
    //         hm.put(arr[i],i);
    //         if(hm.containsKey(arr[i]))
    //             hm.remove(arr[i]);
    //     }
        
    //     System.out.println(hm);

    // }
    
}
