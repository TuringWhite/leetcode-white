package a121_130;

public class A129 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	class Solution {
		int sum = 0;

		public int sumNumbers(TreeNode root) {
			if (root == null)
				return 0;
			dfs(root, 0);
			return sum;
		}

		public void dfs(TreeNode root, int num) {
			int temp = num * 10 + root.val;
			if (root.left == null && root.right == null) {
				sum += temp;
				return;
			}
			if (root.left != null)
				dfs(root.left, temp);
			if (root.right != null)
				dfs(root.right, temp);
		}
	}
}
