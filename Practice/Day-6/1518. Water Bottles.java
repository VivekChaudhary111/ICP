class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total_ans = numBottles;
        while(numBottles >= numExchange){
            total_ans += numBottles/numExchange;
            numBottles = numBottles/numExchange + numBottles%numExchange;
        }
        return total_ans;
    }
}
