package others2;

import java.util.HashSet;
import java.util.Set;

public class A653 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	class Solution {
		Set<Integer> set = new HashSet<>();

		public boolean findTarget(TreeNode root, int k) {
			dfs(root);
			for (int num : set) {
				if (k - num == num)
					continue;
				if (set.contains(k - num))
					return true;
			}
			return false;
		}

		public void dfs(TreeNode root) {
			set.add(root.val);
			if (root.left != null)
				dfs(root.left);
			if (root.right != null)
				dfs(root.right);
		}
	}
}
