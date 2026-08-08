class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int open = 0;
        StringBuilder sb = new StringBuilder();
        rec(open,n,sb,ans);
        return ans;
    }

    void rec(int open, int n, StringBuilder sb, List<String> ans){
        if (open < 0 || n < 0) return;
        if (open == n){
            int i = sb.length();
            while(open-->0) {
                sb.append(')');
            }
            ans.add(sb.toString());
            sb.delete(i,sb.length());
            return;
        } 
        if (open == 0) {
            sb.append('(');
            rec(open+1,n,sb,ans);
            sb.delete(sb.length()-1,sb.length());
            return;
        }
        
        sb.append('(');
        rec(open+1,n,sb,ans);
        sb.delete(sb.length()-1,sb.length());
        sb.append(')');
        rec(open-1,n-1,sb,ans);
        sb.delete(sb.length()-1,sb.length());
    }
}