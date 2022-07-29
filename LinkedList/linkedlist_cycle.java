public class linkedlist_cycle {
    
}
//---------------------------------------Amazone microsoft-------------------------------------------
//https://leetcode.com/problems/linked-list-cycle/submissions/


//leetcode soln

public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                return true;
        }
        return false;
    }
}

//if it is asked to calculate the length of the cycle then
public class Solution {
    public boolean lengthCycle(ListNode head) {
        
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                //cal length
                ListNode temp=slow;
                int length=0;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }
        return 0;
    }
}