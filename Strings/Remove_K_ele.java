/*
Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.

 

Example 1:
Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.

Example 2:
Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
*/
import java.util.*;
public class Remove_K_ele {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of k:");
        int k=sc.nextInt();
        System.out.print("Enter the string: ");
        String s=sc.next();
  
        System.out.println(removeKdigits(s, k));
    }
    public static String removeKdigits(String num, int k) {
        
        Stack<Character> st=new Stack<>();
        int size=num.length();
        
        if(k==size)
            return "0";
        
        int i=0;
        while(i<size)
        {
            while(k>0 && !st.isEmpty() && st.peek()>num.charAt(i))
            {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
            i++;
        }
        while(k>0 && !st.isEmpty())
        {
            st.pop();
            k--;
        }
        
        StringBuilder sb=new StringBuilder();
        
        while(!st.isEmpty())
        {
            char curr_char=st.pop();
            sb.append(curr_char);
        }
        sb.reverse();
        
        while(sb.toString().startsWith("0"))
        {
           sb.deleteCharAt(0); 
        }
            
    return sb.length() == 0 ? "0" : sb.toString();
}
}
