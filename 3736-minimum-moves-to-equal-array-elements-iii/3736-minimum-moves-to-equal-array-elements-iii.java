class Solution {
    public int minMoves(int[] nums) {
        int ans = 0, max = 0;
        for (int i : nums)
            max = (i > max)? i : max;
        
        for (int i : nums)
            ans += (max - i);

        return ans;
    }
}