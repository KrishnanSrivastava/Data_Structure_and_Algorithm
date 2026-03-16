class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        int[] prev = new int[heights.length];
        int[] next = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            if (stk.isEmpty()) {
                prev[i] = -1;
            } else {
                while ((!stk.isEmpty()) && (heights[stk.lastElement()] >= heights[i])) {
                    stk.pop();
                }
                if (stk.isEmpty()) {
                    prev[i] = -1;
                } else {
                    prev[i] = stk.lastElement();
                }
            } stk.push(i);

            if (stk2.isEmpty()) {
                next[heights.length - 1 - i] = heights.length;
            } else {
                while ((!stk2.isEmpty()) && (heights[stk2.lastElement()] >= heights[heights.length - 1 - i])) {
                    stk2.pop();
                }
                if (stk2.isEmpty()) {
                    next[heights.length - 1 - i] = heights.length;
                } else {
                    next[heights.length - 1 - i] = stk2.lastElement();
                }
                
                } stk2.push(heights.length - 1 - i);
        }

        int max = 0;
        for (int i = 0 ; i < heights.length ; i++){
            int area = heights[i] * (next[i] - prev[i] - 1);
            max = Math.max(max,area);
        }
        return max;
    }          
}
