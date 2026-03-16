class Solution {
    public int trap(int[] height) {
        int n = height.length,l = 0, r = 0;
        int [] rmax = new int [n], lmax = new int [n];
        int i,ans = 0;
        for (i = 0; i < n; i++){
            if (height[i] > l){
                l = height[i];
            }
            lmax[i] = l;

            if (height[n - i - 1] > r)
                r = height[n - i - 1];
            rmax[n - i - 1] = r;
        }

        for (i = 0; i < n; i++){
            ans += Math.min(lmax[i],rmax[i]) - height[i];
        }
        return ans;
    }
}