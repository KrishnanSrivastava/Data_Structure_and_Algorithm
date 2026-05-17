class Solution {
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for (int[] i : edges){
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }
        boolean[] visited = new boolean[V];
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < V ; i++){
            if (!visited[i]){
                visited[i] = true;
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                dfs(i,adj,list,visited);
                ans.add(list);
            }
        }
        return ans;
    }
    void dfs(int i, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list, boolean[] visited){
        
        for (int j : adj.get(i)){
            if (!visited[j]){
                visited[j] = true;
                list.add(j);
                dfs(j,adj,list,visited);
            }
        }
    }
}