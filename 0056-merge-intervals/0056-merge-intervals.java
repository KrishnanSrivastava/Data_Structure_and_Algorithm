class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();
        int[] ans = {intervals[0][0], intervals[0][1]};
        for (int i = 1; i < intervals.length; i++){
            if (ans[1] >= intervals[i][0]) {
                ans = merge(ans,intervals[i]);
            }
            else {
                list.add(ans);
                ans = intervals[i];
            }
        }
        list.add(ans);
        int [][] answer = list.toArray(new int[list.size()][]);
        return answer;
    }
    int[] merge(int[] a, int[] b) {
        a[1] = Math.max(a[1],b[1]);
        return a;
    }
}