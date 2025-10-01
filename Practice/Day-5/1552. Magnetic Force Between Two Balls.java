import java.util.*;
class Solution {
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int ans = 1;
        int low = 1;
        int high = (int) Math.ceil(position[n-1]/(m-1.0));
        while(low <= high){
            int mid = low + (high-low)/2;
            if(isValid(position, m, mid)){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public static boolean isValid(int[] position, int m, int mid){
        m--;
        int last = position[0];
        for(int i = 1; i < position.length && m > 0; i++){
            if(position[i] - last >= mid){
                m--;
                last = position[i];
            }
        }
        return m == 0;
    }
}