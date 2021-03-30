package others4;

public class A1325 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	class Solution {
		int target;

		public TreeNode removeLeafNodes(TreeNode root, int target) {
			this.target = target;
			TreeNode dummy = new TreeNode(0);
			dummy.left = root;
			dfs(dummy);
			return dummy.left;

		}

		public boolean dfs(TreeNode root) {
			if (root.left == null && root.right == null) {
				if (root.val == target)
					return true;
				else {
					return false;
				}
			}
			boolean left = false;
			boolean right = false;
			if (root.left != null)
				left = dfs(root.left);
			if (root.right != null)
				right = dfs(root.right);
			if (left == true)
				root.left = null;
			if (right == true)
				root.right = null;
			if (root.left == null && root.right == null && root.val == target) {
				return true;
			}
			return false;
		}
	}
}
