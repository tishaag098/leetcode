   //Sort the array using cyclic sort
// to use this the array should be in the range
import java.util.*;
public class CyclicSort {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elemnts of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclic(int [] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex])
               swap(arr,i,correctIndex);
            else
               i++;
        }
        
    }
    public static void swap(int arr[],int j,int m)
    {
        int temp=arr[j];
        arr[j]=arr[m];
        arr[m]=temp;
    }
}
