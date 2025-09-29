import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int totalElements = m*n;
        int added = 0;
        int row_s = 0;
        int col_s = 0;
        int row_e = m-1;
        int col_e = n-1;
        while(added<totalElements){
            for(int i = col_s; i<=col_e && added<totalElements; i++){
                ans.add(matrix[row_s][i]);
                added++;
            }
            row_s++;
            for(int j = row_s; j<=row_e && added<totalElements; j++){
                ans.add(matrix[j][col_e]);
                added++;
            }
            col_e--;
            for(int k = col_e; k>=col_s && added<totalElements; k--){
                ans.add(matrix[row_e][k]);
                added++;
            }
            row_e--;
            for(int l = row_e; l>=row_s && added<totalElements; l--){
                ans.add(matrix[l][col_s]);
                added++;
            }
            col_s++;
        }
        return ans;
    }
}