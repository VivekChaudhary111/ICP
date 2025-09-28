class Solution {
    public long splitArray(int[] nums) {
        int n = nums.length;
        long[] pre = new long[n];
        long[] suf = new long[n];
        pre[0] = nums[0];
        suf[n-1] = nums[n-1];

        int[] strictI = new int[n];
        int[] strictD = new int[n];
        strictI[0] = 1;
        strictD[n-1] = 1;

        for (int i = 1; i < n; i++) {
            pre[i] = nums[i] + pre[i-1];
            if (nums[i] > nums[i-1] && strictI[i-1] == 1) strictI[i] = 1;
        }

        for (int i = n-2; i >= 0; i--) {
            suf[i] = nums[i] + suf[i+1];
            if (nums[i] > nums[i+1] && strictD[i+1] == 1) strictD[i] = 1;
        }

        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n-1; i++) {
            if (strictI[i] == 1 && strictD[i+1] == 1) ans = Math.min(ans, Math.abs(pre[i] - suf[i+1]));
        }

        return ans == Long.MAX_VALUE ? -1 : ans;
    }
}