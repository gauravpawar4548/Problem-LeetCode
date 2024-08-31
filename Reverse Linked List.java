//Reverse Linked List

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode ls= null;

        while(head !=null)
        {
            ListNode next =head.next;
            head.next =ls;
            ls = head;
            head = next;
        }
        return ls;


  
        
    }
}