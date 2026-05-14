class Solution {
    public boolean isGood(int[] nums) {
        int[] count = new int[nums.length-1];
        for (int i : nums){
            if (i > nums.length-1) return false;
            count[i-1]++;
            if (i != nums.length-1 && count[i-1] > 1) return false;
        }
        if (count[count.length - 1] != 2) return false;
        return true;
    }
}