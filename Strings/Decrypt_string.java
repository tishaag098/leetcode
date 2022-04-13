/*
You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.

The test cases are generated so that a unique mapping will always exist.

 

Example 1:
Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".

Example 2:
Input: s = "1326#"
Output: "acz"
*/
import java.util.*;
public class Decrypt_string {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s=sc.nextLine();
  
        System.out.println(freqAlphabets(s));
    }
    public static String freqAlphabets(String s) {
        
        StringBuilder sb=new StringBuilder();
        
         for(int i=s.length()-1;i>=0;i--)
         {
             if(s.charAt(i)=='#')
             {
                 int str=Integer.parseInt(s.substring(i-2,i));
                 sb.append((char)(96 + str));
                 i=i-2;
             }
             else
             {
                 sb.append((char)(96+(s.charAt(i)-'0')));
             }
         }
        sb.reverse();
        return sb.toString();
    }
}
