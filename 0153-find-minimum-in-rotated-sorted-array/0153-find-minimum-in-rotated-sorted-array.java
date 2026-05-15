class Solution {
    public int findMin(int[] nums) {
        return rec(nums,0,nums.length-1);
    }
    int rec(int[] nums, int i, int j){
        if (i == j || nums[i] < nums[j]) return nums[i];
        int mid = i + (j - i)/2;
        if (nums[mid] < nums[i]){
            return rec(nums,i,mid);
        } else {
            return rec(nums,mid+1,j);
        }
    }
}