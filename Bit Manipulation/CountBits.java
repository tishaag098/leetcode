/*
Given a positive integer N, print count of set bits in it. 

Example 1:

Input:
N = 6
Output:
2
Explanation:
Binary representation is '110' 
So the count of the set bit is 2.
*/
//---------------Brian Kernighan’s algorithm--------------------------------
//The Brian Kernighan’s algorithm is used to count its set bits of an integer.
//--------------Time comp: O(log n)-------------------------
import java.util.*;
class CountBits{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int c=0;//counter
        while(n!=0)
        {
            n=n&(n-1);
            c++;
        }
        System.out.println("no. of bits are: "+c);
    }
}
