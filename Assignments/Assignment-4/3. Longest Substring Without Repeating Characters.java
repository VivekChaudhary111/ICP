import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxL = 0;
        Set<Character> set = new HashSet<>();
        int i = 0;
        
        for (int j = 0; j < n; j++) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                maxL = Math.max(maxL, j - i + 1);
            } else {
                while (set.contains(s.charAt(j))) {
                    set.remove(s.charAt(i));
                    i++;
                }
                set.add(s.charAt(j));
            }
        }
        
        return maxL;
    }
}