/*
A sentence is a list of tokens separated by a single space with no leading or trailing spaces. Every token is either a positive number consisting of digits 0-9 with no leading zeros, or a word consisting of lowercase English letters.

For example, "a puppy has 2 eyes 4 legs" is a sentence with seven tokens: "2" and "4" are numbers and the other tokens such as "puppy" are words.
Given a string s representing a sentence, you need to check if all the numbers in s are strictly increasing from left to right (i.e., other than the last number, each number is strictly smaller than the number on its right in s).

Return true if so, or false otherwise.

Input: s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles"
Output: true
Explanation: The numbers in s are: 1, 3, 4, 6, 12.
They are strictly increasing from left to right: 1 < 3 < 4 < 6 < 12.

Example 2:
Input: s = "hello world 5 x 5"
Output: false
Explanation: The numbers in s are: 5, 5. They are not strictly increasing.
*/
import java.util.*;
public class CheckIfNumAreAscending {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.nextLine();
        System.out.println(areNumbersAscending(s));
    }
    public static boolean areNumbersAscending(String s) {
            String arr[]=s.split(" ");
            int prev=0;
            for(int i=0;i<arr.length;i++)
            {
                char ch=arr[i].charAt(0);
                if(ch>='0' && ch<='9')
                {
                    int curr=Integer.parseInt(arr[i]);
                    if(curr<=prev)
                        return false;
                    else
                        prev=curr;
                }
            }         
            return true; 
        }
    }
