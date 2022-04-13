/*-------------------Accolite Amazon FactSet Google MakeMyTrip Microsoft Qualcomm Samsung-------------------------
Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs
whereas the other two number occur exactly once and are distinct. Find the other two numbers.

Example 1:
Input: 
N = 2
arr[] = {1, 2, 3, 2, 1, 4}
Output:
3 4 
Explanation:
3 and 4 occur exactly once.
*/

import java.util.*;
class Twonon_repeating_no {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int res=0;

        for(int i=0;i<n;i++)
        {
            res=res^arr[i];//XOR of all the elements
        }
        int rsbm=res & -res;//right most set bit mask of the XOR of the two unique element present in the array

        int x=0;
        int y=0;

        for(int i=0;i<n;i++)
        {
            if((arr[i] & rsbm)==0)
            {
                x=x^arr[i];
            }
            else
            {
                y=y^arr[i];
            }
        }
        if(x>y)
        {
            System.out.println(y);
            System.out.println(x);
        }
        else{
            System.out.println(x);
            System.out.println(y);

        }
    
    }
}
