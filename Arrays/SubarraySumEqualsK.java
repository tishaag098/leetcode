
import java.util.*;
class SubarraySumEqualsK{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array n:");
        int n=sc.nextInt();
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(subarray(arr, n, k));

    }
    /*--------------------------------------O(n^3)-----------------------------------
    public static int subaaray(int arr[],int n,int X)
    {
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[i];
                }
                if(sum==X)
                   ans++;
            }
        }
        return ans;
    }
    --------------------------------------------O(n^2)--------------------------------
    public static int subaaray(int arr[],int n,int X)
    {
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[i];
                if(sum==X)
                   ans++;
            }
        }
        return ans;
    }
    */
    public static int subarray(int arr[],int n,int k)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1); // it is imp to put 0 initially in the hashmap
        int ans=0,sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(hm.containsKey(sum-k))
                ans+=hm.get(sum-k);
            
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return ans;

    }

}