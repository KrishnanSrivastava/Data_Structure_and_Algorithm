class Solution {
    public int totalNQueens(int n) {
        
        int mat[][] = new int[n][n];
        return place(0, mat);
    }

    int place(int i, int[][] mat) {
        if (i == mat.length) {
            return 1;
        }
        int ans = 0;
        for (int j = 0; j < mat.length; j++) {
            if (isSafe(mat, i, j) == true) {
                mat[i][j] = 1;
                ans += place(i + 1, mat);
                mat[i][j] = 0;
            }
        }
        return ans;
    }

    boolean isSafe(int[][] mat, int row, int col) {
        int i, j;
        for (i = row; i >= 0; i--) {
            if (mat[i][col] == 1) {
                return false;
            }
        }

        for (i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (mat[i][j] == 1) {
                return false;
            }
        }

        for (i = row - 1, j = col + 1; j < mat.length && i >= 0; j++, i--) {
            if (mat[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}