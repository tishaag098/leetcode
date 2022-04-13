/*
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1

Example 2:
Input: n = 16
Output: true
Explanation: 24 = 16
*/
import java .util.*;
public class powerof2 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        boolean res=isPowerOfTwo(n);
        if(res)
          System.out.println(true);
        else
          System.out.println(false);
    }

    public static boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        
        int val=n & (n-1);
        if(val==0)
            return true;
        
        return false;
        
    }

    
}
