/*
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
 
Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
*/
import java.util.*;
public class Flipping_an_img {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array N * M:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] image=new int[n][m];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                 image[i][j]=sc.nextInt();
        }
        flipAndInvertImage(image);
    }
    public static void flipAndInvertImage(int[][] image) {
        
        int[][] arr=new int[image.length][image[0].length];
        
        for(int i=0;i<image.length;i++)
        {
            for(int j=image[0].length-1;j>=0;j--)
            {
                arr[i][image[0].length-1-j]=(image[i][j]==0) ? 1 : 0;
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
                 System.out.print(arr[i][j]+",");
            System.out.print(" ");
        }
    } 
}
