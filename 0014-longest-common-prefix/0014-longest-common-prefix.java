class Solution {
    public String longestCommonPrefix(String[] strs) {
        for (int col = 0; col < strs[0].length(); col++){
            char c = strs[0].charAt(col);
            for (int row = 1; row < strs.length; row++){
                if ((col >= strs[row].length()) || (strs[row].charAt(col) != c)){
                    return strs[0].substring(0,col);
                }
            }
        }
        return strs[0];
    }
}