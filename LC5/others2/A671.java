package others2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A671 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	class Solution {
		Set<Integer> set;

		public int findSecondMinimumValue(TreeNode root) {
			set = new HashSet<>();
			dfs(root);
			List<Integer> list = new ArrayList<Integer>(set);
			list.sort(null);
			return list.size() >= 2 ? list.get(1) : -1;
		}

		public void dfs(TreeNode root) {
			if (root == null)
				return;
			if (!set.contains(root.val))
				set.add(root.val);
			dfs(root.left);
			dfs(root.right);
		}
	}
}
