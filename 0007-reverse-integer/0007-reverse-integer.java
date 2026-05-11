class Solution {
    public int reverse(int x) {
        boolean isNeg = x < 0;
        int max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;
        if (x == min || x == max) return 0;
        if (isNeg) x *= -1;
        int ans = 0;
        while(x > 0){
            if (ans > max / 10) return 0;
            ans *= 10;
            if (ans > max - (x % 10)) return 0;
            ans += x % 10;
            x /= 10;
        }
        return (isNeg)? -ans : ans;
    }
}       