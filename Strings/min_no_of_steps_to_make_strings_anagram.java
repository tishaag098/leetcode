/*
You are given two strings of the same length s and t. In one step you can choose any character of t and replace it with another character.

Return the minimum number of steps to make t an anagram of s.

An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.

Example 1:
Input: s = "bab", t = "aba"
Output: 1
Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.

Example 2:
Input: s = "leetcode", t = "practice"
Output: 5
Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.

*/
import java.util.*;
public class min_no_of_steps_to_make_strings_anagram {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the first string s:");
        String s=sc.next();
        System.out.println("Enter the second string t:");
        String t=sc.next();
        System.out.println(minSteps(s, t));
    }
    public static int minSteps(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(!map.containsKey(ch))
                count++;
            else
            {
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0)
                    map.remove(ch);
            }
        }
        return count;
    }
}
