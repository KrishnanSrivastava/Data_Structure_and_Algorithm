class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = baskets.length;
        int[] seg = new int[n * 4];
        build(0,n - 1,0,seg,baskets);
        int answer = 0;
        for (int i = 0; i < fruits.length; i++) {
            answer += ans(0,n-1,0,seg,fruits,i);
        }
        return answer;
    }

    void build(int l, int r, int idx, int[] seg, int[] arr) {
        if (l == r) {
            seg[idx] = arr[l];
            return;
        }
        int mid = (l + r) / 2;
        build(l,mid,2 * idx + 1,seg,arr);
        build(mid + 1,r,2 * idx + 2,seg,arr);
        seg[idx] = Math.max(seg[2*idx+1],seg[2*idx+2]);
    }

    int ans(int l, int r, int idx, int[] seg, int[] arr, int i) {
        if (seg[idx] < arr[i]) return 1;
        if (l == r) {
            seg[idx] = 0;
            return 0;
        }
        int mid = (l + r)/2;
        int a = ans(l,mid,2*idx+1,seg,arr,i);
        if (a == 0) return 0;
        return Math.min(a,ans(mid+1,r,2*idx+2,seg,arr,i));
    }
}