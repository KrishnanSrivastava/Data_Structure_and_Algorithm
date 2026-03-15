class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return rec(0, s.length() - 1, s, dp);
    }

    int rec(int i, int j, String s, int[][] dp) {
        if (i == j)
            return 1;
        if (i > j)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];

        if (s.charAt(i) == s.charAt(j)) {
            return dp[i][j] = 2 + rec(i + 1, j - 1, s, dp);
        }
        return dp[i][j] = Math.max(rec(i + 1, j, s, dp), rec(i, j - 1, s, dp));
    }
}