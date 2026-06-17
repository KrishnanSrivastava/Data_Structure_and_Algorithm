class Solution {
    public int jump(int[] nums) {
        int l = 0, r = 0, max = 0, jump = 0;
        while(max < nums.length - 1){
            for (int i = l; i <= r; i++){
                max = Math.max(max,i+nums[i]);
            }
            jump++;
            l = r+1;
            r = max;
        }
        return jump;
    }
}