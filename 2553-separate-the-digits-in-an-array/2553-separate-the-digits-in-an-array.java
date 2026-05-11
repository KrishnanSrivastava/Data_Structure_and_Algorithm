class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();
        for (int n : nums){
            while(n > 0){
                stk.push(n % 10);
                n /= 10;
            }
            while(!stk.isEmpty()){
                list.add(stk.pop());
            }
        }
        int n = list.size();
        int [] ans = new int[n];
        for (int i = 0; i < n; i++) 
            ans[i] = list.get(i);
        return ans;
    }
}