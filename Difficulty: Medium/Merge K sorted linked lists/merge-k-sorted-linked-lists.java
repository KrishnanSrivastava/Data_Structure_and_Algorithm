/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node mergeKLists(Node[] arr) {
        // code here
        if (arr.length == 0) return null;

        Node head = arr[0];
        for (int i = 1; i < arr.length; i++){
            head = sort(head,arr[i]);
        }
        return head;
    }
    
    Node sort(Node head1, Node head2){
        Node head = new Node(0);
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