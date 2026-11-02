class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        List<Integer> indx = new ArrayList<>();

        for (int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                indx.add(i);
            }
        }

        for (int i = 0; i < indx.size()/2; i++){
            int fir = indx.get(i);
            int las = indx.get(indx.size() - i - 1);
            sb.setCharAt(fir,s.charAt(las));
            sb.setCharAt(las,s.charAt(fir));
        }  

        return sb.toString();      
    }

    boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }
}