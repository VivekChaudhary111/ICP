import java.util.*;
class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for(int col = 1; col < n; col++){
            ArrayList<Integer> ll1 = new ArrayList<>();
            int i = 0, j = col;
            while(i < m && j < n){
                ll1.add(grid[i][j]);
                i++;
                j++;
            }
            Collections.sort(ll1);
            int idx = 0;
            i = 0;
            j = col;
            while(i < m && j < n){
                grid[i][j] = ll1.get(idx++);
                i++;
                j++;
            }
        }
        for(int row = 0; row < m; row++){
            ArrayList<Integer> ll2 = new ArrayList<>();
            int i = row, j = 0;
            while(i < m && j < n){
                ll2.add(grid[i][j]);
                i++;
                j++;
            }
            Collections.sort(ll2, Collections.reverseOrder());
            int idx = 0;
            i = row;
            j = 0;
            while(i < m && j < n){
                grid[i][j] = ll2.get(idx++);
                i++;
                j++;
            }
        }
        return grid;
    }
}