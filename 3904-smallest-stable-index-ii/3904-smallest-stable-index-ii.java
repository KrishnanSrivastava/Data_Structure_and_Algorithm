class Solution {
    public int firstStableIndex(int[] nums, int k) {
        Stack<Integer> stk = new Stack<>();
        stk.push(nums.length-1);
        for (int i = nums.length - 2; i >= 0; i--){
            if (nums[stk.peek()] >= nums[i]) stk.push(i);
        }
        int max = -1;
        for (int i = 0;i < nums.length; i++){
            if (max < nums[i]) max = nums[i];
            int ans = max - nums[stk.peek()];
            if (ans <= k) return i;
            if (i == stk.peek()) stk.pop();
        }
        return -1;
    }
}