/*--------------------------------Amazone----------------------------------------------------------
Find position of an element in a sorted array of infinite numbers

*/

public class pos_infinite_nos {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,6,7,7,8,19,88,89,90,666,888,999,7890};
        int target=8;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr,int target)
    {
        //first find the range
        //first start with the box of size 2
        int start=0;
        int end=1;
        //condition for target to lie in the range
        while(target>arr[end])
        {
            int temp=end+1;// this is my newStart
            //idea is to double the value of box
            end=end+(end-start+1)*2;
            start=temp;
        }
        return BinarySearch(arr, target,start,end);
    }
    public static int BinarySearch(int arr[],int target,int start,int end)
    {

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(target<arr[mid])
                end=mid-1;
            else if(target>arr[mid])
                start=mid+1;
            else
                return mid;  //ans found
        }
        return -1;
    }
}
