class Solution {
    public int maxJumps(int[] arr, int d) {
        int[] dp = new int[arr.length];
        int ans=0;
        for (int i = 0; i < arr.length; i++){
            ans = Math.max(ans,rec(i,arr,d,dp));
        } 
        return ans;
    }
    int rec(int idx, int[] arr, int d,int[] dp){
        if (dp[idx] != 0) return dp[idx];
        int ans = 1;
        for (int i = idx+1; i <= idx+d; i++){
            if (i >= arr.length || arr[i] >= arr[idx]) break;
            ans = Math.max(ans,1 + rec(i,arr,d,dp));
        }
        for (int i = idx-1; i >= idx-d; i--){
            if (i < 0 || arr[i] >= arr[idx]) break;
            ans = Math.max(ans,1 + rec(i,arr,d,dp));
        }
        return dp[idx] = ans;
    }
}