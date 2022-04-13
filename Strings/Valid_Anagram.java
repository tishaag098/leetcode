/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
*/
import java.util.*;
public class Valid_Anagram {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string s: ");
        String s=sc.next();
        System.out.print("Enter the string t: ");
        String t=sc.next();
  
        System.out.println(isAnagram(s, t));
    }
    public static boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())
            return false;
        
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            hm.put(arr1[i],hm.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(!hm.containsKey(arr2[i]))
                return false;
            
            hm.put(arr2[i],hm.get(arr2[i])-1);
            
            if(hm.get(arr2[i])<=0)
                hm.remove(arr2[i]);
        }
        return true;
    }
}
