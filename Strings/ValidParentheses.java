/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 
Example 1:
Input: s = ")"
Output: false

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
s="[()]"
Output: true
*/
import java.util.*;
public class ValidParentheses {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s=sc.nextLine();
  
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(st.isEmpty() && (ch==']' || ch=='}' || ch==')'))
                return false;
            if(ch=='(' || ch=='{' || ch=='[')
                st.push(ch);
            else{
                if(ch==')' && st.pop()!='(')
                    return false;
                if(ch==']' && st.pop()!='[')
                    return false;
                if(ch=='}' && st.pop()!='{')
                    return false;
            }
        }
        return st.isEmpty();
    }
    
}
