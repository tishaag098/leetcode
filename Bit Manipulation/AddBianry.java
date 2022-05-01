/*
Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
*/

import java.util.*;
class AddBianry{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String a:");
        String a=sc.nextLine();
        System.out.println("Enter a String b:");
        String b=sc.nextLine();


     
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        int i=a.length()-1; //at the last index of the string
        int j=b.length()-1;
        
        int sum=0,carry=0;
        StringBuilder ans=new StringBuilder();
        while(i>=0 || j>=0)
        {
            sum=carry;
            if(i>=0)
                sum+=a.charAt(i--)-'0';
            if(j>=0)
                sum+=b.charAt(j--)-'0';
            carry=sum>1?1:0;
            ans.append(sum%2);
        }
        if(carry!=0)
            ans.append(carry);
        
        return ans.reverse().toString();
        
        
    }
}