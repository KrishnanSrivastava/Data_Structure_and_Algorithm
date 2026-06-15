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
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;
        ListNode fast = head;
        ListNode slow  = head;
        
        while(fast != null){
            fast = fast.next.next;
            if (fast == null || fast.next == null){
                slow.next = slow.next.next;
                break;
            }
            slow = slow.next;
        }
        return head;
    }
}