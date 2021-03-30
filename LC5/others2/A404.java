package others2;

public class A404 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	class Solution {
		int sum = 0;

		public int sumOfLeftLeaves(TreeNode root) {
			if (root == null)
				return 0;
			dfs(root);
			return sum;
		}

		public void dfs(TreeNode root) {
			if (root.left != null) {
				if (root.left.left == null && root.left.right == null)
					sum += root.left.val;
				dfs(root.left);
			}
			if (root.right != null)
				dfs(root.right);

		}
	}
}
