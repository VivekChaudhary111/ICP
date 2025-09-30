import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()){
            return new ArrayList<>();
        }
        int[] freq = new int[26];
        for(int i = 0; i < p.length(); i++){
            freq[p.charAt(i) - 'a']++;
        }
        
        int[] comp = new int[26];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < p.length(); i++){
            comp[s.charAt(i) - 'a']++;
        }
        
        int left = 0;
        if(Arrays.equals(freq, comp)){
            list.add(left);
        }
        
        int right = p.length();
        while(right < s.length()){
            comp[s.charAt(right) - 'a']++;  
            comp[s.charAt(left) - 'a']--;  
            left++;                         
            right++;
            
            if(Arrays.equals(freq, comp)){
                list.add(left);
            }
        }
        
        return list;
    }
}