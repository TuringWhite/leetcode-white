package others1;

public class A938 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	class Solution {
		int sum = 0;
		int left, right;

		public int rangeSumBST(TreeNode root, int low, int high) {
			left = low;
			right = high;
			dfs(root);
			return sum;
		}

		public void dfs(TreeNode root) {
			if (root == null)
				return;
			if (root.val <= right && root.val >= left) {
				sum += root.val;
				dfs(root.left);
				dfs(root.right);
			} else if (root.val > right) {
				dfs(root.left);
			} else if (root.val < left) {
				dfs(root.right);
			}

		}
	}
}
