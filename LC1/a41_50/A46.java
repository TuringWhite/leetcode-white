package a41_50;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class A46 {
	class Solution {
		List<List<Integer>> result = new ArrayList<>();

		public List<List<Integer>> permute(int[] nums) {
			Stack<Integer> stack = new Stack<>();
			List<Integer> from = new ArrayList<>();
			for (int num : nums)
				from.add(num);
			dfs(stack, from);
			return result;
		}

		public void dfs(Stack<Integer> stack, List<Integer> from) {
			if (from.size() == 0) {
				result.add(new ArrayList<>(stack));
				return;
			}
			for (int i = 0; i < from.size(); i++) {
				int remove = from.remove(i);
				stack.push(remove);
				dfs(stack, from);
				stack.pop();
				from.add(i, remove);
			}
		}
	}
}

class Solution3 {
	int[] nums;
	boolean[] flags;
	List<List<Integer>> res;

	public List<List<Integer>> permute(int[] nums) {
		this.nums = nums;
		flags = new boolean[nums.length];
		Stack<Integer> stack = new Stack<>();
		res = new ArrayList<>();
		dfs(stack);
		return res;
	}

	public void dfs(Stack<Integer> stack) {
		if (stack.size() == nums.length) {
			res.add(new ArrayList<>(stack));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (flags[i] == false) {
				stack.add(nums[i]);
				flags[i] = true;
				dfs(stack);
				stack.pop();
				flags[i] = false;
			}
		}
	}
}