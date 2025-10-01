import java.util.*; 
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int start = 0;
        for(int end = people.length - 1; end >= start; end--){
            if(people[end] + people[start] <= limit){
                start++;
            }
            boats++;
        }
        return boats;
    }
}