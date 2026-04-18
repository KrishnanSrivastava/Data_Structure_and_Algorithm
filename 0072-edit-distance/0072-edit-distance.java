class Solution {
    public int minDistance(String word1, String word2) {
       int [][] dp = new int[word1.length()][word2.length()];
       for (int[] i: dp) Arrays.fill(i,-1);
       return match(0,0,word1,word2,dp);
    }

    int match(int i, int j, String word1, String word2, int[][] dp){
        if (i == word1.length() && j == word2.length()) return 0;
        if ((i == word1.length()) && (j < word2.length())) return word2.length() - j;
        if (j == word2.length()) return word1.length() - i;
        if (dp[i][j] != -1) return dp[i][j];
        if (word1.charAt(i) == word2.charAt(j)){
            return dp[i][j] = match(i+1,j+1,word1,word2,dp);
        }
        int a,b,c;
        a = match(i+1,j,word1,word2,dp);
        b = match(i,j+1,word1,word2,dp);
        c = match(i+1,j+1,word1,word2,dp);

        return dp[i][j] = 1 + Math.min(a,Math.min(b,c));

    }
}