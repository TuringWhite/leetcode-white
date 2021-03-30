package others3;

public class A1315 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	class Solution {
		int sum = 0;

		public int sumEvenGrandparent(TreeNode root) {
			dfs(root, false);
			return sum;
		}

		public void dfs(TreeNode root, boolean flag) {
			if (root == null)
				return;
			if (flag == true) {
				if (root.left != null)
					sum += root.left.val;
				if (root.right != null)
					sum += root.right.val;
			}
			if (root.val % 2 == 1)
				flag = false;
			else {
				flag = true;
			}
			dfs(root.left, flag);
			dfs(root.right, flag);
		}
	}
}
