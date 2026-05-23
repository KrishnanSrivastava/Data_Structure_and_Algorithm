class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int first = nums[0];
        int dec = 0;
        for (int i = 1; i < n; i++) {
            if (dec == 0) {
                if (nums[i] < nums[i - 1]){
                    dec++;
                    if (nums[i] > first) return false;
                }
            } else {
                if (nums[i] < nums[i - 1] || nums[i] > first)
                    return false;
            }
        }
        return true;
    }
}