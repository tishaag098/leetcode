public class merge_two_sorted_list {
    
}

//https://leetcode.com/problems/merge-two-sorted-lists/

// You are given the heads of two sorted linked lists list1 and list2.
// Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
// Return the head of the merged linked list.

// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]

// Example 2:
// Input: list1 = [], list2 = []
// Output: []

//leetcode soln
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode dummyHead=new ListNode();
        ListNode current=dummyHead;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                current.next=l1;
                l1=l1.next;
                current=current.next;
            }
            else
            {
                current.next=l2;
                l2=l2.next;
                current=current.next;
            }
        }
        current.next=(l1!=null) ? l1:l2;
        return dummyHead.next;
    }
}