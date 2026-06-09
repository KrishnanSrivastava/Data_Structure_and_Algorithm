class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i, j = 0, ans = 0;
        for (i = 0; i < s.length; i++){
            if (g[j] <= s[i]){
                ans++;
                j++;
                if (j == g.length) break;
            }
        }
        return ans;
    }
}