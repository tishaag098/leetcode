/*Given a number, toggle all bits of it after most significant bit including most significant bit.

Examples : 
Input : 10 
Output : 5
Binary representation of 10 is 1010
After toggling we get 0101

Input : 5
Output : 2
*/
//---------------------time comp:(n)----------------------------
import java.util.*;
class ToggleBits{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=sc.nextInt();
        int nextSetBit=1;
        while(nextSetBit<=n)
        {
            n=n^nextSetBit;//XOR    LET n=10    1010^0001
            nextSetBit=nextSetBit<<1;//Right shift    nextSetBit=0010
        }
        System.out.println(n);
    }
}
//---------------------can be done in time comp: O(1)-----------------------------