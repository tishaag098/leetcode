/*
Given a string s, return true if the s can be palindrome after deleting at most one character from it.

Example 1:
Input: s = "aba"
Output: true

Example 2:
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

*/
import java.util.*;
public class valid_palindrome_II {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s=sc.nextLine();
  
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        
        int i=0;
        int j=s.length()-1;
        
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }
        }
        return true;
    }
    
    public static boolean isPalindrome(String s,int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
