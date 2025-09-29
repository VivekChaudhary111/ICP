import java.util.*;
class Solution {
    int[]delRow = {-1,0,+1,0};
    int []delCol = {0,+1,0,-1};
    public int numIslands(char[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    int count = 0;
    boolean [][]vis = new boolean[m][n];
    Queue<Pair> q = new LinkedList<Pair>();
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]=='1' && vis[i][j]==false){
            vis[i][j] = true;
            count++;
            q.add(new Pair(i,j));
            BFS(q,grid,vis,m,n);
            }
        }
    }
    return count;
    }
    private void BFS(
        Queue<Pair>q,
        char [][]str,
        boolean [][]vis,
        int m,
        int n
    ){
        while(!q.isEmpty()){
            Pair p = q.poll();
            int r = p.row;
            int c = p.col;

            for(int i=0;i<4;i++){
                int row = r + delRow[i];
                int col = c + delCol[i];

                if(row>=0 && row<m && col>=0 && col<n && vis[row][col]==false && str[row][col]=='1'){
                    vis[row][col]  = true;
                    q.add(new Pair(row,col));
                }
            }
        }
    }
}
class Pair{
    int row;
    int col;
    Pair(int r,int c){
        this.row = r;
        this.col = c;
    }
}