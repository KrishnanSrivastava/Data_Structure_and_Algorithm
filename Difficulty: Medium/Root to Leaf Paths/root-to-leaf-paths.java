/*
Definition for Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int val)
    {3
        this.data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<Integer> li = new ArrayList<>();
        ArrayList<ArrayList<Integer>> lili = new ArrayList<>();
        rec(root,li,lili);
        return lili;
    }
     void rec(Node root,ArrayList<Integer> li,ArrayList<ArrayList<Integer>> lili){
         if (root == null) return;
         if (root.left == null && root.right == null){
             li.add(root.data);
             lili.add(new ArrayList<>(li));
             li.remove(li.size()-1);
             return;
         }
         li.add(root.data);
         rec(root.left,li,lili);
         rec(root.right,li,lili);
         li.remove(li.size() - 1);
     }
}