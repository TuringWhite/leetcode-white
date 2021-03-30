package others2;

public class A543 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	class Solution {
		int ans = 0;

		public int diameterOfBinaryTree(TreeNode root) {
			if (root == null)
				return 0;
			dfs(root);
			return ans;
		}

		public int dfs(TreeNode root) {
			if (root == null)
				return 0;
			int left = dfs(root.left);
			int right = dfs(root.right);
			ans = Math.max(ans, left + right + 1);
			return Math.max(left, right) + 1;
		}
	}
}
