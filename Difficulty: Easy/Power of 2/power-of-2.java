class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        int temp = 1;
        while(n >= temp){
            if (temp == n) return true;
            temp = temp << 1;
        }
        return false;
    }
}