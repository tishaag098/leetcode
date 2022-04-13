/*
Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?

Example 1:
Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.

Example 2:
Input:
n1=3; A={3, 3, 3}
n2=3; B={3, 3, 3}
n=3; C={3, 3, 3}
Output: 3
*/
import java.util.*;
import java.util.HashMap;

public class commonEle_in_3sorted {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter n3: ");
        int n3 = sc.nextInt();
        int[] A = new int[n1];
        int[] B = new int[n2];
        int[] C = new int[n3];
        System.out.println("Enter the elements of the array A: ");
        for (int i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the array B: ");
        for (int i = 0; i < n2; i++) {
            B[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the array C: ");
        for (int i = 0; i < n3; i++) {
            C[i] = sc.nextInt();
        }
        M1commonElement(A, B, C, n1, n2, n3);
        // M2commonElement(A, B, C, n1, n2, n3);
    }

    public static void M1commonElement(int A[], int B[], int C[], int n1, int n2, int n3) {
        int i = 0, j = 0, k = 0;
        ArrayList<Integer> al = new ArrayList<>();
        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && A[i] == C[k]) {
                al.add(A[i]);// common element
                int ele = A[i];
                // to remove duplicacy
                while (i<n1 && A[i]==ele)
                    i++;
                while (j<n2 && B[j] == ele)
                    j++;
                while (k<n3 && C[k] == ele)
                    k++;
            } 
            else if (A[i] < B[j])
                i++;
            else if (B[j] < C[k])
                j++;
            else
                k++;

        }
        for (int ele : al) {
            System.out.println(ele);
        }
    }

    // ----------------------------Time complexity:
    // O(n1+n2+n3)-------------------------------------
    // ----------------------------Space complexity:
    // O(n1+n2+n3)-------------------------------------
    public static void M2commonElement(int A[], int B[], int C[], int n1, int n2, int n3) {
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        HashMap<Integer, Integer> hm3 = new HashMap<>();
        for (int i = 0; i < n1; i++)
            hm1.put(A[i], i);
        for (int i = 0; i < n2; i++)
            hm2.put(B[i], i);
        for (int i = 0; i < n3; i++)
            hm3.put(C[i], i);

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            if (hm1.containsKey(A[i]) && hm2.containsKey(A[i]) && hm3.containsKey(A[i])) {
                arr.add(A[i]);
                hm1.remove(A[i]);
            }
        }
        for (int ele : arr)
            System.out.print(arr);
    }

}
