class Solution {
    public int findMin(int[] nums) {
        int i = 0, j = nums.length - 1;
        int mid;
        while (i < j) {
            if (nums[i] < nums[j])
                return nums[i];
            else if (nums[i] == nums[j]) {
                int num = nums[i];
                while (nums[i] == num) {
                    i++;
                    if (i == j)
                        return nums[i];
                }
                while (nums[j] == num) {
                    if (nums[j] < nums[j-1]) return nums[j];
                    j--;
                    if (i == j)
                        return nums[i];
                }
            } else {
                mid = i + (j - i) / 2;
                if (nums[i] > nums[mid])
                    j = mid;
                else
                    i = mid + 1;
            }
        }
        return nums[i];
    }
}