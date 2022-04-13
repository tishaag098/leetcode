/*--------------------Accolite,Amazon-------------------------------------------------------
You are given a number n, representing the number of stairs in a staircase.
You are on the 0th step and are required to climb to the top.
You are given n numbers, where ith element's value represents - till how far from the step you could jump to in a single move. 
You are required to print the number of minimum moves in which you can reach the top of the staircase.
Example:
Array:[1,3,5,8,9,2,6,7,6,8,9]
Output:
3

*/
// CODE IN JAVA
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    System.out.println("enter the size of array");
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    Integer[] dp = new Integer[n + 1];
    dp[n] = 0;

    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] == 0)
        continue;
      int min = Integer.MAX_VALUE;
      for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
        if (dp[i + j] != null) {
          min = Math.min(min, dp[i + j]);
        }
      }
      if (min != Integer.MAX_VALUE)
        dp[i] = min + 1;
    }
    System.out.println(dp[0]);
    scn.close();
  }
}
