package others3;

public class A538 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	class Solution {
		int pre = 0;

		public TreeNode convertBST(TreeNode root) {
			dfs(root);
			return root;
		}

		public void dfs(TreeNode root) {
			if (root == null)
				return;
			dfs(root.right);
			pre = root.val + pre;
			root.val = pre;
			dfs(root.left);
		}
	}
}
