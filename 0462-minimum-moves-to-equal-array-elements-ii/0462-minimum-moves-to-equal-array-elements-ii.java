class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int num;
        if (n % 2 == 0){
            num = (nums[n/2] + nums[n / 2 - 1]) / 2;
        }
        else 
            num = nums[(n - 1)/2];

        int ans = 0;
        for (int i : nums){
            ans += Math.abs(num - i);
        }
        return ans;
    }
}