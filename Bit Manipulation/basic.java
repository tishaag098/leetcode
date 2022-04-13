
/*
(i) Find ith bit

*/
import java.util.*;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Enter the value of i:");
        int i = sc.nextInt();
        get_ith_bit(n, i);
        set_ith_bit(n, i);

    }

    public static void get_ith_bit(int n, int i) {
        int mask = 1;
        if ((n & (mask << i))==0)// left shift bit masking
            System.out.println("0");
        else
            System.out.println("1");
    }
    public static void set_ith_bit(int n,int i)
    {
        int mask=1;
        n=n | (mask<<i);
        System.out.println(n);

    }

}
