/*
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.

Example 1:
Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6
Explanation: 
- The first sentence, "alice and bob love leetcode", has 5 words in total.
- The second sentence, "i think so too", has 4 words in total.
- The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
*/
import java.util.*;
public class Max_no_of_words_in_sentence {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter the array of strings: ");
        String arr[]=new String[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.next();
        System.out.println(mostWordsFound(arr));
    }
    //---------------------------------------this code is not working here but its working on leetcode-------------------------------------------
    public static int mostWordsFound(String[] sentences) {
        int max_count=0;
        
        for(int i=0;i<sentences.length;i++)
        {
            max_count=Math.max(max_count,countWords(sentences[i]));
        }
        return max_count;
    }
        
        public static int countWords(String s)
        {
            int count=0;
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch==' ')
                    count++;
            }
            return count+1;
        }
    
}
