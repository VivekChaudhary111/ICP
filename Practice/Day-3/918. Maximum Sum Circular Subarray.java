class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            totalSum += nums[i];
        }
        int minSum = kadaneMin(nums);
        int maxSum = kadaneMax(nums);
        int circularSum = totalSum - minSum;

        if(maxSum > 0){
            return Math.max(circularSum, maxSum);
        }
        return maxSum;
    }
    public static int kadaneMax(int[] nums){
        int ans = nums[0];
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum = Math.max(sum + nums[i], nums[i]);
            ans = Math.max(sum, ans);
        }
        return ans;
    }
    public static int kadaneMin(int[] nums){
        int ans = nums[0];
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum = Math.min(sum + nums[i], nums[i]);
            ans = Math.min(sum, ans);
        }
        return ans;
    }
}