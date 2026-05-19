class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> que = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 1) fresh++;
                else if (grid[i][j] == 2){
                    int[] arr = {i,j};
                    que.add(arr);
                }
            }
        }
        if (fresh == 0) return 0; 
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        int ans = -1;
        while (!que.isEmpty()){
            int size = que.size();
            for (int i = 0; i < size; i++){
                int[] arr = que.poll();
                for (int j = 0; j < 4; j++){
                    int newx = arr[0] + dir[j][0];
                    int newy = arr[1] + dir[j][1];
                    if (isvalid(grid,newx,newy)){
                        fresh--;
                        grid[newx][newy] = 2;
                        int[] newarr = {newx,newy};
                        que.add(newarr);
                    }
                }
            }
            ans++;
        }
        if (fresh != 0) return -1;
        return ans;
    }
    boolean isvalid(int[][] grid,int i, int j){
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return false;
        return (grid[i][j] == 1);
    }
}