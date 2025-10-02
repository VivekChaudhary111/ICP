import java.util.*;
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int max = 0;
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        for(int i = 0; i < boxTypes.length && truckSize > 0; i++){
            if(boxTypes[i][0] <= truckSize){
                max += boxTypes[i][0]*boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }else{
                max += truckSize*boxTypes[i][1];
                break;
            }
        }
        return max;

    }
}