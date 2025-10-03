import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        int prev = -1;
		Combination(candidates, target, ll, ans, prev, 0);
		return ans;
	}
	public static void Combination(int[] candidates, int target, List<Integer> ll, List<List<Integer>> ans, int prev,  int idx) {
		if(target == 0) {
//			System.out.println(ll);
            // for(int i = 0; i < ans.size(); i++){
            //     if(ans.contains(ll)){
            //         return;
            //     }
            // }
			ans.add(new ArrayList<>(ll));
			return;
		}
		for(int i = idx; i<candidates.length; i++) {
			if(target >= candidates[i]) {
                if(prev == candidates[i]) continue;
				ll.add(candidates[i]);
				Combination(candidates, target-candidates[i], ll, ans, prev, i + 1);
				ll.remove(ll.size() - 1);
                prev = candidates[i];
			}
		}
    }
}