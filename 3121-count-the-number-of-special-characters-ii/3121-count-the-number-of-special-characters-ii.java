class Solution {
    public int numberOfSpecialChars(String word) {
        int ans = 0;
        int[] count = new int[26];
        for (int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if (ch < 'a'){
                if (count[ch - 'A'] == -1) continue;
                if (count[ch - 'A'] == 0) count[ch - 'A'] = -1;
                else if (count[ch - 'A'] == 1) count[ch - 'A']++;
            } else {
                if (count[ch - 'a'] == -1) continue;
                if (count[ch - 'a'] == 2) count[ch - 'a'] = -1;
                else if (count[ch - 'a'] == 0) count[ch - 'a']++;
            }
        }
        for (int i : count) ans = (i == 2)? ans+1:ans;
        return ans;
    }
}