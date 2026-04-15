class Solution {
    public int longestPalindrome(String s) {
        int[] character = new int[(26 * 2) + 6];
        for (int i = 0; i < s.length(); i++){
            character[s.charAt(i) - 'A']++;
        }
        int ans = 0;
        boolean hasOdd = false;
        for (int i : character){
            if (i % 2 == 0) ans += i;
            else {
                hasOdd = true;
                ans += i - 1;
            }
        }
        ans = (hasOdd) ? ans+1 : ans;
        return ans;
    }
}