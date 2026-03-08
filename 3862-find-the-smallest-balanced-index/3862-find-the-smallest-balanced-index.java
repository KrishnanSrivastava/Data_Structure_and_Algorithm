class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int start = 0, end = nums.length - 1;
        long sum = 0, pro = 1;
        while(start <= end){
            
            if (sum < pro){
                sum += nums[start];
                start++;
            }
                      
            else{
                if ((sum == pro) && (end == start))
                    return start;
                pro *= nums[end];
                end--;
            }
        }
        return -1;
    }
}