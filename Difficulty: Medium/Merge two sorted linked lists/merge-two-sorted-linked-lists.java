/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node head = new Node(-1);
        Node temp = head;
        while(head1 != null && head2 != null){
            if (head1.data < head2.data){
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            } else {
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }
        while(head1 != null) {
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }
        
        while(head2 != null){
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }
        return head.next;
    }
}