class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long m = mass;
        Arrays.sort(asteroids);
        for (int i : asteroids){
            if (i > m) return false;
            m += i;
        }
        return true;
    }
}