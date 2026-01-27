class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        
        boolean[] isVisited = new boolean[adj.size()];
        
        isVisited[0] = true;
        
        while (!queue.isEmpty()){
            int i = queue.poll();
            ans.add(i);
            for (int j : adj.get(i)){
                if (isVisited[j] == false){
                    queue.add(j);
                    isVisited[j] = true;
                }
            }
        }
        
        return ans;
    }
}