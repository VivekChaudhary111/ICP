import java.util.*;
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combinations(n, k, ll, ans, 1);
        return ans;
    }
    public static void combinations(int n, int k, List<Integer> ll, List<List<Integer>> ans, int idx){
        if(k == 0){
            ans.add(new ArrayList(ll));
            return;
        }
        for(int i = idx; i <= n; i++){
            if(n > 0){
                ll.add(i);
                combinations(n, k - 1, ll, ans, i + 1);
                ll.remove(ll.size() - 1);
            }
        }
    }
}