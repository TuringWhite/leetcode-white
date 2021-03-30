package a31_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A40 {
	class Solution {
		List<List<Integer>> result = new ArrayList<>();

		public List<List<Integer>> combinationSum2(int[] candidates, int target) {
			List<Integer> list = new ArrayList<>();
			Arrays.sort(candidates);
			help(list, candidates, target, 0);
			return result;
		}

		public void help(List<Integer> list, int[] candidates, int target, int cur) {
			if (target == 0) {
				List<Integer> copy = new ArrayList<>();
				for (int num : list) {
					copy.add(num);
				}
				copy.sort(null);
				if (!result.contains(copy))
					result.add(copy);
			}
			if (target < 0)
				return;
			for (int i = cur; i < candidates.length; i++) {
				if (target - candidates[i] < 0)
					break;
				System.out.println(i + "    " + target);
				list.add(candidates[i]);
				help(list, candidates, target - candidates[i], i + 1);
				list.remove(list.size() - 1);
			}
		}
	}
}
