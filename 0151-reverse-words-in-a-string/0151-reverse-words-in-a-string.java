class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        rev(s.length() - 1,s,sb);
        sb.delete(0,1);
        return sb.toString();
    }

    void rev(int i, String s, StringBuilder sb){
        
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }
         if (i < 0) return;
        sb.append(' ');
        int j = i;
        while(j >= 0 && s.charAt(j) != ' ') j--;

        sb.append(s.substring(j+1,i+1));
        rev(j,s,sb);
    }

}