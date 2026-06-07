class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        for (int[] i : dp)
            Arrays.fill(i, 100000);
        return rec(0, 0, triangle, dp);
    }

    int rec(int i, int j, List<List<Integer>> triangle, int[][] dp) {
        if (j == triangle.size())
            return 0;
        if (i == triangle.get(j).size())
            return 100000;
        if (dp[i][j] != 100000)
            return dp[i][j];
        return dp[i][j] = triangle.get(j).get(i)
                + Math.min(rec(i, j + 1, triangle, dp), rec(i + 1, j + 1, triangle, dp));
    }
}