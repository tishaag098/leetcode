/*
1. You are given an integer N which represents the total number of soldiers standing in a circle 
     having position marked from 1 to N.
2. A cruel king wants to execute them but in a different way.
3. He starts executing soldiers from 1st position and proceeds around the circle in clockwise 
     direction.
4. In each step, every second soldier is executed.
5. The elimination proceeds around the circle (which is becoming smaller and smaller as the 
     executed soldiers are removed), until only the last soldier remains, who is given freedom.
6. You have to find the position of that lucky soldier.

Input:
4
Output:
1
*/
import java.util.*;
public class JosephusPrblm {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int hp2=powerof2(n);//hp2=highest power of 2
        int l=n-hp2;

        System.out.println(2*l +1); //2l+1
    }
    public static int powerof2(int n)
    {
        int i=1;
        while((i*2)<=n)
        {
            i=i*2;
        }
        return i;
    }
    
}
