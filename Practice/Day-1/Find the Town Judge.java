class Solution {
    public int findJudge(int n, int[][] trust) {
        boolean [] judge = new boolean[n+1];
        int[] trustedBy = new int[n+1];
        for(int i = 0; i < trust.length; i++){
            judge[trust[i][0]] = true;
            trustedBy[trust[i][1]] += 1;
        }
        for(int i = 1; i <= n; i++){
            if(!judge[i] && trustedBy[i] == n-1){
                return i;
            }
        }
        return -1;
    }
}
