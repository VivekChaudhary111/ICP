import java.util.*;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] cache1 = new int[26], cache2 = new int[26];
        for (int i = 0; i < s1.length(); ++i) {
            cache1[s1.charAt(i) - 'a']++;
            cache2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(cache1, cache2)) return true;

        for (int i = s1.length(); i < s2.length(); i++) {
            cache2[s2.charAt(i - s1.length()) - 'a']--;
            cache2[s2.charAt(i) - 'a']++;
            if (Arrays.equals(cache1, cache2)) return true;
        }

        return false;
    }
}