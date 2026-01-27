class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean [] visited = new boolean[adj.size()];
        ArrayList<Integer> ans = new ArrayList<>();
        rec(visited,ans,adj,0);
        return ans;
    }
    
    void rec(boolean[] visit, ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> adj, int n){
        if (visit[n] == true) return;
        visit[n] = true;
        ans.add(n);
        for (int i : adj.get(n)){
            rec(visit,ans,adj,i);
        }
    }
}