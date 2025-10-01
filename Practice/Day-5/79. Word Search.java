class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == word.charAt(0)){
                    if(check(board, visited, word, 0, i, j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean check(char[][] board, boolean[][] visited, String word, int idx, int r, int c) {
        if (idx == word.length()) return true; 
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length) return false;
        if (visited[r][c]) return false;
        if (board[r][c] != word.charAt(idx)) return false;

        visited[r][c] = true;
        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};
        for (int k = 0; k < 4; k++) {
            if (check(board, visited, word, idx + 1, r + dr[k], c + dc[k])) return true;
        }
        visited[r][c] = false; 
        return false;
    }
}