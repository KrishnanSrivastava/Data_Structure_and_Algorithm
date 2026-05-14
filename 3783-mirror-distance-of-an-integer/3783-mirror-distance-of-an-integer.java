class Solution {
    public int mirrorDistance(int n) {
        long num = n;
        long rev = 0;
        while(n > 0){
            rev *= 10;
            rev = rev + (n % 10);
            n /= 10;
        }
        int ans = (int) Math.abs(num-rev);
        return ans;
    }
}