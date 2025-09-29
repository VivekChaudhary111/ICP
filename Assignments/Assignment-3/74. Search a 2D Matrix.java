class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        // whether element is in the range
        if(matrix[0][0] > target || matrix[m-1][n-1] < target){
            return false;
        }

        // finding the row
        int row = -1;
        int low = 0;
        int high = m-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(matrix[mid][0] <= target){
                row = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        // finding the element in that row
        low = 0;
        high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(matrix[row][mid] == target){
                return true;
            }else if(matrix[row][mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return false;
    }
}