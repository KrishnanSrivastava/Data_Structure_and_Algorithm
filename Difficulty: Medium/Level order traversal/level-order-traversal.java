/* A binary tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            
            Node temp = que.poll();
            ans.add(temp.data);
            if (temp.left != null) que.add(temp.left);
            if (temp.right != null) que.add(temp.right);
        }
        return ans;
    }
}