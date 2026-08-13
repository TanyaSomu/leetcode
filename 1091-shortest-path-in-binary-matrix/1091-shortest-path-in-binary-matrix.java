import java.util.*;
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
       int n = grid.length;
       if(grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;
       int[] dx = new int[]{-1,-1,-1,0,0,1,1,1};
       int[] dy = new int[]{-1,0,1,-1,1,-1,0,1};
       Queue<int[]> q = new LinkedList<>();
       boolean[][] v = new boolean[n][n];
       q.add(new int[]{0,0,1});
        v[0][0] = true;
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            int d = curr[2];
            if(r == n-1 && c == n-1) return d;
            for(int i=0; i<8; i++){
                int nr = r + dx[i];
                int nc = c + dy[i];
                if(nr < 0 || nr >= n || nc < 0 || nc >= n) continue;
                if(grid[nr][nc] == 0 && !v[nr][nc]){
                    v[nr][nc] = true;
                    q.add(new int[]{nr,nc,d+1});
                }
            }
        }
        return -1;
    }
}