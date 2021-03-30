package others3;

public class A817 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	class Solution {
		public TreeNode pruneTree(TreeNode root) {
			return dfs(root) ? root : null;
		}

		public boolean dfs(TreeNode root) {
			if (root == null)
				return false;
			boolean left = dfs(root.left);
			boolean right = dfs(root.right);
			if (!left)
				root.left = null;
			if (!right)
				root.right = null;
			return left || right || root.val == 1;
		}
	}
}
