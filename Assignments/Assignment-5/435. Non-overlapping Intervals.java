import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int start = 0;
        int cnt = 0;
        for(int end = 1; end < intervals.length; end++){
            if(intervals[start][1] > intervals[end][0]){
                cnt++;
            }else{
                start = end;
            }
        }
        return cnt;
    }
}