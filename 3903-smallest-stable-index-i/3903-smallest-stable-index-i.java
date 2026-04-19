class Solution {
    public int firstStableIndex(int[] nums, int k) {
        Stack <Integer> stk = new Stack<>();
        stk.push(nums.length-1);
        int i, max = -1;
        for (i = nums.length - 2; i >= 0; i--){
            if (nums[stk.peek()] >= nums[i]) stk.push(i);
        }
        int ans;
        for (i = 0; i < nums.length; i++){
            if (max < nums[i]) max = nums[i];
            ans = max - nums[stk.peek()];
            if (ans <= k) return i;
            if (i == stk.peek()) stk.pop();
        }
        return -1;
    }
}