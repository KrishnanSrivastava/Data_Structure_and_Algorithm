class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean visited[] = new boolean[arr.length];
        return dfs(start,arr,visited);
    }
    boolean dfs(int i, int[] arr, boolean[] visited){
        if (arr[i] == 0) return true;
        visited[i] = true;
        boolean left = (i - arr[i] < 0 || visited[i - arr[i]])? false : dfs(i-arr[i],arr,visited);
        boolean right = (i + arr[i] >= arr.length || visited[i + arr[i]])? false : dfs(i+arr[i],arr,visited);
        return (left || right);
    }
}