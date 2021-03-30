package others7;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class A216 {
	class Solution {
		List<List<Integer>> result = new ArrayList<>();

		public List<List<Integer>> combinationSum3(int k, int n) {
			Stack<Integer> stack = new Stack<>();
			boolean[] help = new boolean[9];
			dfs(stack, help, n, k);
			return result;
		}

		public void dfs(Stack<Integer> stack, boolean[] help, int target, int k) {
			if (target == 0 && stack.size() == k) {
				List<Integer> list = new ArrayList<>(stack);
				list.sort(null);
				if (!result.contains(list))
					result.add(list);
				return;
			}
			for (int i = 1; i <= help.length; i++) {
				if (target - i < 0)
					break;
				if (help[i - 1] == false) {
					help[i - 1] = true;
					stack.add(i);
					dfs(stack, help, target - i, k);
					help[i - 1] = false;
					stack.pop();
				}
			}
		}
	}
}
