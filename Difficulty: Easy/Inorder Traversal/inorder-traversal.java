/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> li = new ArrayList<>();
        traverse(li,root);
        return li;
        
    }
    void traverse(ArrayList<Integer> li, Node root){
        if (root == null) return;
        traverse(li,root.left);
        li.add(root.data);
        traverse(li,root.right);
    }
}