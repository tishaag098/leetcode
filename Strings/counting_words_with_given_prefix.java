/*
You are given an array of strings words and a string pref.

Return the number of strings in words that contain pref as a prefix.

A prefix of a string s is any leading contiguous substring of s.

Example 1:
Input: words = ["pay","attention","practice","attend"], pref = "at"
Output: 2
Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
*/
//----------------------------------just the leetcode code----------------------------

class counting_words_with_given_prefix{
    public static void main(String[] args)
    {
        
    }




    public int prefixCount(String[] words, String pref) {
        
        int len=pref.length();
        int count=0;
        
        for(int i=0;i<words.length;i++)
        {
            if(words[i].length()>=len  &&  words[i].substring(0,len).equals(pref))
                count++;
        }
        return count;
    }
}