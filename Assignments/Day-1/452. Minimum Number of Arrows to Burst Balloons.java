class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> a[1]-b[1]);
        int arrows = 1;
        int shoot = points[0][1];
        for(int i = 1; i<points.length; i++){
            if(shoot >= points[i][0] && shoot <= points[i][1]){
                continue;
            }else{
                arrows++;
                shoot = points[i][1];
            }
        }
        return arrows;
    }
}
