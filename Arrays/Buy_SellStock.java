
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and 
choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. 
If you cannot achieve any profit, return 0.

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/
import java.util.*;

public class Buy_SellStock {
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
        MaxProfit(arr,n);
    }
    public static void MaxProfit(int arr[],int n)
    {
        int min=Integer.MAX_VALUE;
        int max=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
               min=arr[i];
            else if(arr[i]-min > max) 
               max=arr[i]-min;
        }
        System.out.println("max profit: "+max);

    }
    
}
