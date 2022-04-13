/*
Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.

Example 1:
Input: n = 27
Output: true

Example 2:
Input: n = 0
Output: false
*/
import java .util.*;
public class powerOf3 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        boolean res=isPowerOfThree(n);
        if(res)
          System.out.println(true);
        else
          System.out.println(false);
    }

    // public static boolean isPowerOfThree(int n)
    // {
    //     if(n<1)
    //       return false;

    //     while(n%3==0)
    //       n=n/3;
        
    //       return (n==1);

    // }
    public static boolean isPowerOfThree(int n)
    {
        return Math.log10(n)/Math.log10(3) % 1==0;
    }
        
    

    
}
