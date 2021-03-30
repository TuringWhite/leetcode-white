package others3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A508 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	class Solution {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		public int[] findFrequentTreeSum(TreeNode root) {
			if (root == null)
				return new int[0];
			dfs(root);
			int max = Collections.max(map.values());
			List<Integer> list = new ArrayList<Integer>();
			for (int key : map.keySet()) {
				if (map.get(key) == max)
					list.add(key);
			}
			int[] ans = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				ans[i] = list.get(i);
			}
			return ans;
		}

		public int dfs(TreeNode root) {
			int left = 0, right = 0;
			if (root.left != null) {
				left = dfs(root.left);
			}
			if (root.right != null)
				right = dfs(root.right);
			int temp = left + right + root.val;
			if (map.containsKey(temp)) {
				map.replace(temp, map.get(temp) + 1);
			} else {
				map.put(temp, 1);
			}
			return temp;

		}
	}
}
