class Solution {
    public boolean isMatch(String s, String p) {
        int i = s.length();
        int j = p.length();
        int dp[][] = new int[i][j];
        return rec (i-1,j-1,s,p,dp);
    }

    boolean rec(int i, int j, String s, String p, int[][] dp){
        if (i < 0 && j < 0) return true;
        if (j < 0) return false;
        if (i < 0) {
            for (int idx = 0; idx <= j; idx++){
                if (p.charAt(idx) != '*') return false;
            }
            return true;
        }
        if (dp[i][j] != 0) return dp[i][j] == 1;
        if (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i)){
            dp[i][j] = (rec(i-1,j-1,s,p,dp))? 1:2;
            return dp[i][j] == 1;
        }
        if (p.charAt(j) == '*'){
            dp[i][j] = (rec(i,j-1,s,p,dp) || rec(i-1,j,s,p,dp))? 1:2;
            return dp[i][j] == 1;
        }
        dp[i][j] = 2;
        return false;
    }
}