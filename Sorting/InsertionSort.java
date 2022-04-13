//Sort the array using insertion sort

import java.util.Scanner;

import java.util.*;
public class InsertionSort {
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
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertion(int [] arr)
    {
        // if the array size is 5 then it will go only till 4 i.e till index 3
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                    swap(arr,j,j-1);
                else
                    break;
            }
        }
    }
    public static void swap(int arr[],int j,int m)
    {
        int temp=arr[j];
        arr[j]=arr[m];
        arr[m]=temp;
    }
}
