/*
You are given a number N. Find the total count of set bits for all numbers from 1 to N(both inclusive).

Example 1:
Input: N = 4
Output: 5
Explanation:
For numbers from 1 to 4.
For 1: 0 0 1 = 1 set bits
For 2: 0 1 0 = 1 set bits
For 3: 0 1 1 = 2 set bits
For 4: 1 0 0 = 1 set bits
Therefore, the total set bits is 5.
*/


import java.util.*;
public class CountTotalSetBit_inrange {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        int res=0;
        for(int i=1;i<n+1;i++)
        {
            res+= CountSetBit(i);
        }
       
       System.out.println(res);
    }
    public static int CountSetBit(int n)
    {
        int c=0;
        while(n!=0)
        {
            n=n&(n-1);
            c++;
        }
        return c;

    }
}
