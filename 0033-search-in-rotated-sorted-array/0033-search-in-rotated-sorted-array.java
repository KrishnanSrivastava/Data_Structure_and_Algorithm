class Solution {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length-1,mid;
        while(i <= j){
            mid = i + (j - i)/2;
            if (nums[mid] == target) return mid;
            if (i == j) break;
            if (nums[mid] > target){
                if (target >= nums[i] || nums[i] > nums[mid]) j = mid;
                else i = mid + 1;
            } else {
                if (target <= nums[j] || nums[j] < nums[mid]) i = mid+1;
                else j = mid;
            }
        }
        return -1;
    }
}