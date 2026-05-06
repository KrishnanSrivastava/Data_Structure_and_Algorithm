class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0, sum = 0,len = 0, ans = Integer.MAX_VALUE;
        while(j < nums.length){
            if (sum < target){
                if (i == nums.length) break;
                sum += nums[i];
                i++;
                len++;
            } else {
                ans = Math.min(ans,len);
                sum -= nums[j];
                j++;
                len--;
            }
        } 
        return (ans == Integer.MAX_VALUE)? 0 : ans;       
    }
}