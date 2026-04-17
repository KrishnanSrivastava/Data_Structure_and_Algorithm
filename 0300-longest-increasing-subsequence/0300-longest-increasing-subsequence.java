class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > list.get(list.size()-1)) 
                list.add(nums[i]);
            else {
                int l = 0, r = list.size()-1;
                while(l <= r) {
                    int m = l + (r-l)/2;
                    if (list.get(m) < nums[i])
                        l = m+1;
                    else 
                        r = m-1;
                }
                list.set(l,nums[i]);
            }
        }
        return list.size();
    }
}