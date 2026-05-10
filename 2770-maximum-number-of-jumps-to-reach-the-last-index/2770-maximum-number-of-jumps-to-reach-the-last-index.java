class Solution {
    public int maximumJumps(int[] nums, int target) {
        int n = nums.length;
        int[] jumps = new int[n];
        for (int i = 0; i < n-1; i++){
            if (jumps[i] == 0 && i != 0) continue;
            for (int j = i+1; j < n; j++){
                if (Math.abs(nums[i]-nums[j]) <= target){
                    jumps[j] = Math.max(jumps[j],jumps[i] + 1);
                }
            }
        }
        return (jumps[n-1] == 0)? -1 : jumps[n-1];
    }
}