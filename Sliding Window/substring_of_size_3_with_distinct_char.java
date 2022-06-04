/*
https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/

A string is good if there are no repeated characters.
Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.
Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
A substring is a contiguous sequence of characters in a string.

Example 1:
Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".

Example 2:
Input: s = "aababcabc"
Output: 4
Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc"
*/
import java.util.*;
public class substring_of_size_3_with_distinct_char {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        System.out.println(countGoodSubstrings(s));
    }
    public static int countGoodSubstrings(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        
        int i=0,j=0,count=0;
        
        while(j<s.length())
        {
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            if(j-i+1==3)
            {
                if(map.get(ch)==1 && map.get(s.charAt(i))==1)
                    count++;
                if(map.get(s.charAt(i))==1)
                    map.remove(s.charAt(i));
                else
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                
                i++;
            }
            j++;
        }
        return count;
    }
}

