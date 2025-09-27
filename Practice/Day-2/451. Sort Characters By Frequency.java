import java.util.*;
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.freq - a.freq);
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(char key: map.keySet()){
            Pair p = new Pair();
            p.ch = key;
            p.freq = map.get(key);
            pq.add(p);
        }
        StringBuilder ans = new StringBuilder();
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            String charStr = String.valueOf(p.ch);
            ans.append(charStr.repeat(p.freq));
        }
        return ans.toString();
    }
    class Pair{
        char ch;
        int freq;
    }
}