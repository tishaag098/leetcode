/*
Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
*/

import java.util.*;
public class Palindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        System.out.println(isPalindrome(str));
    }
    static int isPalindrome(String S) {
        // code here
        for(int i=0;i<S.length()/2;i++)
        {
            if(S.charAt(i)!=S.charAt(S.length()-1-i))
                return 0;
        }
        return 1;
    }
    
}
