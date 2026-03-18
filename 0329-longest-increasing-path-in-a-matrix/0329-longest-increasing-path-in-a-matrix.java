class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int ans = 0, n = matrix.length, m = matrix[0].length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans = Math.max(ans, rec(i, j, matrix, dp));
            }
        }
        return ans;
    }

    int rec(int i, int j, int[][] matrix, int[][] dp) {

        if (dp[i][j] != 0)
            return dp[i][j];
        int ans = 1;
        int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        for (int[] d : dir) {
            if (!((i + d[0] < 0) || (i + d[0] >= matrix.length) || (j + d[1] < 0) || (j + d[1] >= matrix[0].length)))
                if (matrix[i][j] < matrix[i + d[0]][j + d[1]])
                    ans = Math.max(ans, 1 + rec(i + d[0], j + d[1], matrix, dp));
        }

        return dp[i][j] = ans;
    }
}