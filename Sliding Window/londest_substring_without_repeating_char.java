/*----------------------------------Asked in almost all the companies: Amazon google uber facebook----------------------------------------------------------
https://leetcode.com/problems/longest-substring-without-repeating-characters/

Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
*/
import java.util.*;
public class londest_substring_without_repeating_char {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        System.out.println(lengthOfLongestSubstring(s));

    }
    /*
    --------------------------------------Brute force approach O(n^3)--------------------------------------------------------------------
    public static int lengthOfLongestSubstring(String s)
    {
        int result=0;
        for(int i=0;i<s.length();i++)
        {
            String subs="";
            for(int j=i;j<s.length();j++)
            {
                subs=s.substring(i,j+1);
                if(hasUniqueChars(subs)==1)
                   result=Math.max(result,subs.length());
            }
        }
        return result;

    }
    public static int hasUniqueChars(String s)
    {
        HashSet<Character> set=new HashSet<>();

        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }
        if(set.size()==s.length())
            return 1;
        return 0;
    }
*/

//---------------------Sliding window-----------------------------------
public static int lengthOfLongestSubstring(String s)
{
    if(s==null || s.length()==0)
        return 0;
    int i=0,j=0,max=0;

    HashSet<Character> set=new HashSet<>();
    while(j<s.length())
    {
       char ch=s.charAt(j);
       while(set.contains(ch))
       {
           set.remove(s.charAt(i));
           i++;
       }
       set.add(ch);
       max=Math.max(max,j-i+1);
       j++;
    }
    return max;
}
    
}
