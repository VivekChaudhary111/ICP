class Solution {
    public int[] decimalRepresentation(int n) {
        int len = (int) Math.floor(Math.log10(n)) + 1;
        int n_ = n;
        while(n_ > 0){
            int num = n_ % 10;
            if(num == 0) len--;
            n_ /= 10;
        }
        int[] ans = new int[len];
        int prod = 1;
        int idx = len-1;
        while(n > 0 && idx >= 0){
            int num = n % 10;
            if(num != 0){
                ans[idx--] = num*prod;
            }
            prod *= 10;
            n /= 10;
        }
        return ans;
    }
}