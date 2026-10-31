class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (isSafe(flowerbed, i)) {
                flowerbed[i] = 1;
                n--;
                if (n <= 0)
                    return true;
            }
        }
        return (n <= 0);
    }

    boolean isSafe(int[] arr, int i) {
        if (arr[i] == 1)
            return false;
        int n = arr.length;
        if (n == 1)
            return true;

        if (i == 0)
            return (arr[i + 1] == 0);
        if (i == n - 1)
            return (arr[i - 1] == 0);

        return (arr[i - 1] == 0 && arr[i + 1] == 0);
    }
}