class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        rec(image,sr,sc,color);
        return image;
    }

    void rec (int[][] image, int sr, int sc, int color){
        if (image[sr][sc] == color) return;
        int original = image[sr][sc];
        image[sr][sc] = color;
        int dir[][] = {{1,0},{0,1},{-1,0},{0,-1}};
        for (int[] d:dir){
            int nr = sr + d[0];
            int nc = sc + d[1];
            if ((nr >= 0) && (nc >= 0) && (nr < image.length) && (nc < image[0].length) && (image[nr][nc] == original)) 
                rec(image,nr,nc,color);
        }
    }
}