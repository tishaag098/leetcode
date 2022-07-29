
import java.util.*;
public class remove_dup_from_sorted_list {
    
    // public static void main(String args[])
    // {
    //     LL list=new LL();
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter the size of the linked list: ");
    //     int n=sc.nextInt();
    //     System.out.println("Enter the linke list of size n");
    //     for(int i=0;i<n;i++)
    //     {
    //         list.insertLast(sc.nextInt());
    //     }
    //     System.out.println(list);
    //     Node head=deleteDuplicates(head);
    //     list.display();
        

    // }


    /*
     https://leetcode.com/problems/remove-duplicates-from-sorted-list/

     Input: head = [1,1,2]
Output: [1,2]

     */
    //leetcode soln
    public Node deleteDuplicates(Node head) {
        
        Node current = head;
        while(current!=null && current.next!=null)
        {
            if(current.val==current.next.val)
            {
                current.next=current.next.next;
            }
            else
                current=current.next;
        }
        return head;
        
    }
    
}
