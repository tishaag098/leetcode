/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
*/
import java.util.*;
public class panagram {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s=sc.nextLine();
  
        System.out.println(check(s));
    }
    public static boolean check(String sentence) {
        
        // if(sentence.length()<26)
        //     return false;
        
        char[] arr=sentence.toCharArray();
        HashSet<Character> set=new HashSet<>();
        
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        return set.size()==26;
        
    }
    
}
