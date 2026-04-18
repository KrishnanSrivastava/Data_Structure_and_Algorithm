class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        int dp[][] = new int [n][m]; 
        return rec(n-1,m-1,s,p,dp);
    }

    boolean rec(int i, int j,String s, String p, int[][] dp){
        if (i < 0 && j < 0) return true;
        if (j < 0) return false;
        if (i < 0) {
            for (int idx = j; idx >= 0; idx -= 2){
                if (p.charAt(idx) != '*') return false;
            }
            return true;
        }
        if (dp[i][j] != 0) return dp[i][j] == 1;
        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
            dp[i][j] = rec(i-1,j-1,s,p,dp)? 1:2;
            return dp[i][j] == 1;
        }
        if (p.charAt(j) == '*') {
            boolean ans = rec(i,j-2,s,p,dp);
            if (s.charAt(i) == p.charAt(j-1) || p.charAt(j-1) == '.')
                ans = ans || rec(i-1,j,s,p,dp);
            dp[i][j] = (ans) ? 1:2;
            return ans;
        }
        dp[i][j] = 2;
        return false;
    }
}