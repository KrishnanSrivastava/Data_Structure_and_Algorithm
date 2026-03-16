class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i, j = 0;
        Deque<Integer> que = new ArrayDeque<>();

        for (i = 0; i < nums.length; i++) {

            if ((!que.isEmpty()) && (que.peekFirst() < j))
                que.pollFirst();

            while ((!que.isEmpty()) && (nums[i] >= nums[que.peekLast()])) {
                que.pollLast();
            }
            que.add(i);

            if (i - j + 1 >= k) {
                ans.add(que.peekFirst());
                j++;
            }
        }

        int[] rans = new int[ans.size()];
        for (i = 0; i < ans.size(); i++) {
            rans[i] = nums[ans.get(i)];
        }
        return rans;
    }
}