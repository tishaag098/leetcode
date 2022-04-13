/*
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

Example 1:
Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.

*/
import java.util.*;
public class SortingTheSentence {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.nextLine();
        String S=sortSentence(s);
        System.out.println(S);
    }
    public static String sortSentence(String s)
    {
        String arr[]=s.split(" ");
        String temp[]=new String[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            int idx=arr[i].charAt(arr[i].length()-1)-'0';
            temp[idx-1]=arr[i].substring(0,arr[i].length()-1);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<temp.length;i++)
        {
            sb.append(temp[i]).append(" ");
        }
         return sb.toString().trim();


    }
}
