class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        Stack <Integer> st2 = new Stack<>();
        st2.push(Integer.MAX_VALUE);
        while(!st.isEmpty()){
            int n = st.pop();
            int c = 0;
            while(n > st2.peek()){
                st.push(st2.pop());
                c++;
            }
            st2.push(n);
            while(c > 0) {
                st2.push(st.pop());
                c--;
            }
        }
        while(st2.peek() != Integer.MAX_VALUE) st.push(st2.pop());
    }
}