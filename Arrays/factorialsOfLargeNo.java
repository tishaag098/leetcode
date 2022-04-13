/*-------------------------------- Adobe BrowserStack MakeMyTrip MAQ Software Microsoft Morgan Stanley Philips Samsung--------------------------------
Given an integer N, find its factorial.

Example 1:
Input: N = 5
Output: 120
Explanation : 5! = 1*2*3*4*5 = 120

Example 2:
Input: N = 10
Output: 3628800
Explanation :
10! = 1*2*3*4*5*6*7*8*9*10 = 3628800
*/
import java.util.*;
public class factorialsOfLargeNo {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        factorial(n);
    }
    static void factorial(int N){
        //code here
        ArrayList<Integer> res=new ArrayList<>();
        res.add(0,1); //adding 1 in the arraylist
        int size=1;
        int carry=0,val=2;
        
        while(val<=N)
        {
            for(int i=size-1;i>=0;i--)
            {
                int temp=res.get(i)*val + carry;
                //store the last digit at index and add remaining to carry
                res.set(i,temp%10);
                //update carry
                carry=temp/10;
            }
            while(carry!=0)
            {
                res.add(0,carry%10);
                carry=carry/10;
                size++;
            }
            val++;
           
        }
        System.out.println(res);
    }


    
}
