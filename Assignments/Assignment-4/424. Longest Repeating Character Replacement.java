class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, n = s.length(), maxLen = 0, maxCount = 0;
        int[] freq = new int[26];
        for(int r = 0; r < n; r++){
            freq[s.charAt(r) - 'A']++;
            maxCount = Math.max(maxCount, freq[s.charAt(r) - 'A']);
            if(r - l + 1 - maxCount > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}