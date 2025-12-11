class Solution {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];

        return rec(m, n, memo);
    }

    int rec(int m, int n, int[][] memo) {
        if (m == 1)
            return 1;
        if (n == 1)
            return 1;
        if (memo[m - 1][n - 1] != 0)
            return memo[m - 1][n - 1];
            
        return memo[m - 1][n - 1] = (rec(m - 1, n, memo) + rec(m, n - 1, memo));
    }
}