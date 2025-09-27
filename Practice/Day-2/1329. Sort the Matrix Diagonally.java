import java.util.*;
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        for(int col = 0; col < n; col++){
            ArrayList<Integer> ll1 = new ArrayList<>();
            int i = 0, j = col;
            while(i < m && j < n){
                ll1.add(mat[i][j]);
                i++;
                j++;
            }
            Collections.sort(ll1);
            int idx = 0;
            i = 0;
            j = col;
            while(i < m && j < n){
                mat[i][j] = ll1.get(idx++);
                i++;
                j++;
            }
        }
        for(int row = 1; row < m; row++){
            ArrayList<Integer> ll2 = new ArrayList<>();
            int i = row, j = 0;
            while(i < m && j < n){
                ll2.add(mat[i][j]);
                i++;
                j++;
            }
            Collections.sort(ll2);
            int idx = 0;
            i = row;
            j = 0;
            while(i < m && j < n){
                mat[i][j] = ll2.get(idx++);
                i++;
                j++;
            }
        }
        return mat;
    }
}