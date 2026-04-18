class Solution {
    public boolean isMatch(String s, String p) {
        int sl = s.length();
        int pl = p.length();
        boolean dp[][] = new boolean[sl + 1][pl + 1];
        dp[0][0] = true;
        for (int j = 1; j < dp[0].length; j++) {
            boolean flag = true;
            for (int idx = 0; idx <= j - 1; idx++) {
                if (p.charAt(idx) != '*') {
                    flag = false;
                    break;
                }
            }
            dp[0][j] = flag;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {

                if (p.charAt(j - 1) == '?' || p.charAt(j - 1) == s.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = (dp[i][j - 1] || dp[i - 1][j]);

                } else
                    dp[i][j] = false;
            }
        }

        return dp[sl][pl];
    }

}