package a41_50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A47 {
	class Solution {
		int[] nums;
		List<List<Integer>> res;
		boolean[] used;

		public List<List<Integer>> permuteUnique(int[] nums) {
			Arrays.sort(nums);
			this.nums = nums;
			res = new ArrayList<>();
			used = new boolean[nums.length];
			List<Integer> list = new ArrayList<Integer>();
			dfs(list);
			return this.res;
		}

		public void dfs(List<Integer> list) {
			if (list.size() == nums.length) {
				res.add(new ArrayList<>(list));
			} else {
				int pre = -11;
				for (int i = 0; i < nums.length; i++) {
					if (used[i] == false && pre != nums[i]) {
						used[i] = true;
						list.add(nums[i]);
						dfs(list);
						used[i] = false;
						list.remove(list.size() - 1);
						pre = nums[i];
					}
				}
			}
		}
	}
}

class Solution {
	boolean[] vis;

	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> perm = new ArrayList<Integer>();
		vis = new boolean[nums.length];
		Arrays.sort(nums);
		backtrack(nums, ans, 0, perm);
		return ans;
	}

	public void backtrack(int[] nums, List<List<Integer>> ans, int idx, List<Integer> perm) {
		if (idx == nums.length) {
			ans.add(new ArrayList<Integer>(perm));
			return;
		}
		for (int i = 0; i < nums.length; ++i) {
			if (vis[i] || (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1])) {
				continue;
			}
			perm.add(nums[i]);
			vis[i] = true;
			backtrack(nums, ans, idx + 1, perm);
			vis[i] = false;
			perm.remove(idx);
		}
	}
}
