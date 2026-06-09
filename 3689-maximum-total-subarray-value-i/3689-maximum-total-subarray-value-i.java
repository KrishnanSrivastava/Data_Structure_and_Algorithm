class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max = -1, min = Integer.MAX_VALUE;
        long ans = 0;
        for (int i : nums){
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        ans = (max - min) * k;
        return ans;
    }
}