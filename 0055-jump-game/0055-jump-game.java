class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1)
            return true;

        boolean ans = false;
        int indx = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if ((nums[i] != 0) && (i + nums[i] >= indx)) {
                ans = true;
                indx = i;
            } else
                ans = false;
        }
        return ans;
    }
}