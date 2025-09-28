import java.util.ArrayDeque;
import java.util.Deque;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1]; // number of windows
        Deque<Integer> deq = new ArrayDeque<>(); // stores indices
        for(int i = 0; i < n; i++){
            //1 make space for nums[i]
            while(!deq.isEmpty() && deq.peekFirst() <= i - k){
                deq.removeFirst();
            }
            //2 check last is not less than nums[i]
            while(!deq.isEmpty() && nums[deq.peekLast()] < nums[i]){
                deq.removeLast();
            }
            //3 push index i
            deq.addLast(i);

            //4 add element
            if(i >= k-1){
                result[i-k+1] = nums[deq.peekFirst()];
            }
        }
        return result;
        
    }
}