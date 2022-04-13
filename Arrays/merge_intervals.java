/*Given an array of intervals where intervals[i] = [starti, endi],
 merge all overlapping intervals, and return an array of the non-overlapping intervals 
 that cover all the intervals in the input.

Example 1:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

Example 2:
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
*/

import java.util.*;
class merge_intervals{

    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int[][] arr=new int[n][2];

        for(int i=0;i<n;i++)
        {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        merge(arr);
    }
/*---------------------------Using Stack method------------------------------------
    public static void merge(int[][] intervals){

        Arrays.sort(intervals,(o1,o2)->{
            return o1[0]-o2[0];
        });

        Stack<int[]> st=new Stack<>();
        st.push(intervals[0]);//[1,3] is pushed in the stack

        for(int i=1;i<intervals.length;i++)
        {
            int[] current=intervals[i];
            int[] last_inserted=st.peek();
             if(current[0]<=last_inserted[1])
             {
                 st.pop();
                 st.push(new int[]{last_inserted[0],Math.max(last_inserted[1],current[1])});
             }
             else{
                 st.push(current);
             }
        }
        // Stack<int[]> res=new Stack<>();
        // while(st.size()>0)
        // {
        //     res.push(st.pop());
        // }
        // while(res.size()>0)
        // {
        //     System.out.println(res.pop());
        // }
        int[][] res = new int[st.size()][2];
        st.toArray(res);
        System.out.println("----------");
        for(int i=0;i<res.length;i++)
        {
          System.out.print("["+res[i][0]+",");
          System.out.print(res[i][1]+"]"+" ");
        }

    }*/
//---------------space comp: O(1)------------------------------
   public static void merge(int[][] intervals)
    {
        Arrays.sort(intervals,(o1,o2)->{
            return o1[0]-o2[0];
        });
        ArrayList<int[]> ans=new ArrayList<>();

        int start=intervals[0][0];// start=1
        int last=intervals[0][1]; //end=3

        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=last && intervals[i][0]>=start)
            {
                last=Math.max(last,intervals[i][1]);
            }
            else
            {
                ans.add(new int[]{start,last});
                start=intervals[i][0];
                last=intervals[i][1];
            }
        }
        ans.add(new int[]{start,last});
        int[][] res=new int[ans.size()][2];
        ans.toArray(res);
        System.out.println("-----------------");
        for(int i=0;i<ans.size();i++)
        {
            System.out.print("["+res[i][0]+",");
            System.out.print(res[i][1]+"]"+" ");
        }
    }

}