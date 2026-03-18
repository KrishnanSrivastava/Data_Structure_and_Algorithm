class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int dp[][] = new int[stones.length][stones.length];
        for(int[] d:dp) Arrays.fill(d,-1);
        for (int i = 0; i < dp[0].length; i++) dp[dp.length - 1][i] = 1;
        for (int i = 0; i < stones.length; i++){
            hash.put(stones[i],i);
        }
        return rec(stones,1,1,hash,dp);
    }

    boolean rec(int arr[], int i, int k,HashMap<Integer,Integer> hash, int[][] dp){
        
        if ((!hash.containsKey(i)) || (k <= 0)) return false;
        i = hash.get(i);
        
        if (dp[i][k] != -1) return (dp[i][k] == 1);

        dp[i][k] = (rec(arr,arr[i]+k-1,k-1,hash,dp) || rec(arr,arr[i]+k,k,hash,dp) || rec(arr,arr[i]+k+1,k+1,hash,dp))?1:0;
        return dp[i][k] == 1; 
    }
}