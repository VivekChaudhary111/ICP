class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = weights[0];
        int high = weights[0];
        for(int i = 1; i < weights.length; i++){
            if(low < weights[i]){
                low = weights[i];
            }
            high += weights[i];
        }
        int ans = high;
        while(low <= high){
            int mid = (low + (high-low)/2);
            if(isValid(weights, days, mid)){
                ans = mid;
                high = mid  - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isValid(int[] weights, int days, int maxWeight){
        int day = 0;
        int sum = 0;
        for(int i = 0; i < weights.length; i++){
            sum += weights[i];
            if(sum > maxWeight){
                day++;
                if(day > days){
                    return false;
                }
                sum = weights[i];
            }
        }
        if(sum <= maxWeight){
            day++;
            if(day > days){
                return false;
            }
        }
        return true;
    }
}
