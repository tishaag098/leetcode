public class linkedlist_cycleII {
    
}
//-----------------------------------most important-------------------------------------------------------------------
//https://leetcode.com/problems/linked-list-cycle-ii/

//if it is asked to calculate the length of the cycle then
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

public ListNode detectCycle(ListNode head) {
    int length=0;
    ListNode fast=head;
    ListNode slow=head;
    
    while(fast!=null && fast.next!=null)
    {
        fast=fast.next.next;
        slow=slow.next;
        if(fast==slow)
        {
            length=lengthCycle(slow);
            break;
        }
    }
    
    //find the start node
    ListNode f=head;
    ListNode s=head;

    while(length>0)
    {
        s=s.next;
        length--;
    }
    
    //keep moving both forward and they will meet at cycle start
    while(f!=s)
    {
        f=f.next;
        s=s.next;
    }
     return s;
        
}

