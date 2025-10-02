import java.util.*;
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int n = people.length;
        Arrays.sort(people, (a,b)-> a[0]==b[0] ? a[1]-b[1]:b[0]-a[0]);
        List<int[]> result = new ArrayList<>();
        for (int[] peoples : people) {
            result.add(peoples[1], peoples);
        }
        return result.toArray(new int[n][2]);
        
    }
}