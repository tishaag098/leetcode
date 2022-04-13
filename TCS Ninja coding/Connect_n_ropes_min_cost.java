/*------------------------------------- Amazon Goldman Sachs OYO Rooms Microsoft-----------------------------------------------------
There are given n ropes of different lengths, we need to connect these ropes into one rope. The cost to connect two ropes is equal to the sum of their lengths. We need to connect the ropes with minimum cost.

For example, if we are given 4 ropes of lengths 4, 3, 2, and 6. We can connect the ropes in the following ways. 
1) First, connect ropes of lengths 2 and 3. Now we have three ropes of lengths 4, 6, and 5. 
2) Now connect ropes of lengths 4 and 5. Now we have two ropes of lengths 6 and 9. 
3) Finally connect the two ropes and all ropes have connected.
Total cost for connecting all ropes is 5 + 9 + 15 = 29. This is the optimized cost for connecting ropes. Other ways of connecting ropes would always have same or more cost. For example, if we connect 4 and 6 first (we get three strings of 3, 2, and 10), then connect 10 and 3 (we get two strings of 13 and 2). Finally, we connect 13 and 2. Total cost in this way is 10 + 13 + 15 = 38.

*/
import java.util.*;
public class Connect_n_ropes_min_cost {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        minCost(arr, n);
    }
    public static void minCost(int arr[],int n)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();//Min heap

        for(int i=0;i<n;i++)
            pq.add(arr[i]);

        int res=0;
        while(pq.size()>1)
        {
            int first=pq.poll(); //this will give the min element int the priority queue
            int second=pq.poll();
            res+=first+second;
            pq.add(first+second);
        }
        
        System.out.println("MINIMUM COST: "+res);
    }
    
}
