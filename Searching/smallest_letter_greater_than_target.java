/*
Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.

Note that the letters wrap around.

For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
 
Example 1:
Input: letters = ["c","f","j"], target = "a"
Output: "c"

Example 2:
Input: letters = ["c","f","j"], target = "c"
Output: "f"

Example 3:
Input: letters = ["c","d","f","j"], target = "j"
Output: "c"
*/
import java.util.*;
public class smallest_letter_greater_than_target {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the target: ");
        char target=sc.next().charAt(0);
        System.out.println("Enter the elements of the array: ");
        
        char[] arr = sc.next().toCharArray();
        char res=nextGreatestLetter(arr, target);
        System.out.println(res);
    }
    //----------------------Linear Search----------------------------------------------------------------------
    // public char nextGreatestLetter(char[] letters, char target) {
    //     for (char c: letters)
    //         if (c > target) return c;
    //     return letters[0];
    // }
    //-----------------------Binary Search-----------------------------------------------------------------------
    public static char nextGreatestLetter(char[] letters, char target) {
        
        int start=0;
        int end=letters.length-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
            if(target<letters[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return letters[start % letters.length];
    }
}
