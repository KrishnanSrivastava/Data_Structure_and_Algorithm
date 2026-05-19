class Solution {
    int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.size(); i++){
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
            adj.get(edges.get(i).get(1)).add(edges.get(i).get(0));
        }
        boolean[] visited = new boolean[V];
        int ans = 0;
        for(int i = 0; i < V ; i++){
            if (!visited[i]){
                ans++;
                visited[i] = true;
                dfs(i,adj,visited);
            }
        }
        return ans;
    }
    void dfs(int i, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
        for (int k : adj.get(i)){
            if (!visited[k]){
                visited[k] = true;
                dfs(k,adj,visited);
            }
        }
    }
}