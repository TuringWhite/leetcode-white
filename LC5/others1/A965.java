package others1;

public class A965 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	class Solution {
		public boolean isUnivalTree(TreeNode root) {

			return dfs(root, root.val);
		}

		public boolean dfs(TreeNode root, int p) {
			if (root == null)
				return true;
			if (root.val == p)
				return dfs(root.left, root.val) && dfs(root.right, root.val);
			return false;
		}
	}
}
