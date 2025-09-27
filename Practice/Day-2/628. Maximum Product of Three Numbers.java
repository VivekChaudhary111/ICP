import java.util.*;
class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        if(n == 3){
            return nums[0]*nums[1]*nums[2];
        }
        Arrays.sort(nums);
        int prod1 = nums[0]*nums[1]*nums[2];
        int prod2 = nums[0]*nums[1]*nums[n-1];
        int prod3 = nums[n-3]*nums[n-2]*nums[n-1];
        return Math.max(prod1, Math.max(prod2, prod3));
    }
}