class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> set = new HashSet<>();
        int[] C = new int[A.length];

        int n = 0;
        for(int i = 0; i < A.length; i++){
            if (set.contains(A[i])) n++;
            else 
                set.add(A[i]);
            if (set.contains(B[i])) n++;
            else 
                set.add(B[i]);
            C[i] = n;
        }
        return C;
    }
}