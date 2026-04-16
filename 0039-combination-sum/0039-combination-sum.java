class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> li = new ArrayList<>();
        List<List<Integer>> lili = new ArrayList<>();
        back(candidates,target,0,li,lili);
        return lili;
    }
    void back(int[] arr, int target, int i, List<Integer> li, List<List<Integer>> lili) {
        if (target == 0)
            lili.add(new ArrayList<Integer>(li));
        if (i == arr.length || target <= 0) return;

        li.add(arr[i]);
        back(arr,target-arr[i],i,li,lili);
        li.remove(li.size()-1);
        back(arr,target,i+1,li,lili);
    }
}