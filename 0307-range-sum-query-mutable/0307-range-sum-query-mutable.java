class NumArray {
    int[] seg;
    int n;
    public NumArray(int[] nums) {
        n = nums.length;
        seg = new int[n * 4];
        build(0,n - 1,nums,0);
    }

    private void build(int l,int r, int[] nums, int idx){
        if (l==r) {
            seg[idx] = nums[l];
            return;
        }
        int mid = l + (r - l)/2;
        build(l,mid,nums,2*idx+1);
        build(mid+1,r,nums,2*idx+2);
        seg[idx] = seg[2*idx+1] + seg[2*idx+2];
    }
    
    public void update(int index, int val) {
        change(0,n-1,0,index,val);
    }

    void change(int l, int r, int idx, int index, int val) {
        if (l == r) {
            seg[idx] = val;
            return;
        }
        int mid = (l + r) >> 1;
        if (index <= mid) change(l,mid,2*idx+1,index,val);
        else change(mid+1,r,2*idx+2,index,val);

        seg[idx] = seg[2*idx+1] + seg[2*idx+2]; 
    }
    
    public int sumRange(int left, int right) {
        return sum(0,n - 1,left,right,0);
    }
    int sum(int l, int r, int left, int right, int idx){
        if (l >= left && r <= right) return seg[idx];
        if (l > right || r < left) return 0;
        int mid = (l + r) / 2;
        return sum(l,mid,left,right,2*idx+1) + sum(mid+1,r,left,right,2*idx+2);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */