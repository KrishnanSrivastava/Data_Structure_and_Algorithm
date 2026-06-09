class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0, j = 0, plat = 0, ans = 0;
        while(i < arr.length){
            if (arr[i] <= dep[j]){
                plat++;
                i++;
            } else {
                plat--;
                j++;
            }
            ans = Math.max(ans,plat);
        }
        return ans;
    }
}
