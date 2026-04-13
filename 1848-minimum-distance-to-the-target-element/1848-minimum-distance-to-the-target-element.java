class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        for (int i = start; i < nums.length; i++){
            if (nums[i] == target){
                right = Math.abs(i - start);
                break;
            }
        }

        for (int i = start; i >= 0; i--){
            if (nums[i] == target){
                left = Math.abs(i - start);
                break;
            }
        }

        return Math.min(left,right);
    }
}