class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character, Integer> set = new HashMap<>();
        int c = 0;
        for (int i = 0; i < word.length(); i++) {
            if (set.containsKey(word.charAt(i))) {
                if (set.get(word.charAt(i)) <= 1) {
                    set.put(word.charAt(i), 2);
                    c++;
                }
                continue;
            }
            if (word.charAt(i) >= 'a') {
                set.put((char) (word.charAt(i) - 32), 1);
            } else {
                set.put((char) (word.charAt(i) + 32), 1);
            }
            set.put(word.charAt(i), 2);
        }
        return c;
    }
}