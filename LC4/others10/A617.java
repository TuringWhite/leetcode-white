package others10;

public class A617 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	class Solution {
		public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
			if (t1 == null)
				return t2;
			if (t2 == null)
				return t1;
			dfs(t1, t2);
			return t1;
		}

		public void dfs(TreeNode t1, TreeNode t2) {
			if (t1 != null && t2 != null) {
				t1.val += t2.val;
				if (t1.left == null && t2.left != null)
					t1.left = new TreeNode();
				if (t1.right == null && t2.right != null)
					t1.right = new TreeNode();
				dfs(t1.left, t2.left);
				dfs(t1.right, t2.right);
			}
		}
	}
}
