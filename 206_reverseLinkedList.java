/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode curr = head;
       ListNode prev = null;

       while(curr != null) {
           ListNode nextNode = curr.next;
           curr.next = prev; // reverse direction of the pointer
           prev = curr; 
           curr = nextNode; // move the pointer ahead
       }
       return prev; // if the linkedlist is empty, return null
    }
}
