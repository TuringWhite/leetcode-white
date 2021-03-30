package others2;

public class A606 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	class Solution {
		StringBuffer ssBuffer = new StringBuffer();

		public String tree2str(TreeNode t) {
			help(t);
			return ssBuffer.toString();
		}

		public void help(TreeNode root) {
			if (root == null) {
				return;
			}
			ssBuffer.append(root.val);
			if (root.left == null && root.right == null)
				return;
			if (root.left != null && root.right != null) {
				ssBuffer.append("(");
				help(root.left);
				ssBuffer.append(")(");
				help(root.right);
				ssBuffer.append(")");
			} else if (root.left != null) {
				ssBuffer.append("(");
				help(root.left);
				ssBuffer.append(")");
			} else if (root.right != null) {
				ssBuffer.append("()(");
				help(root.right);
				ssBuffer.append(")");
			}
		}
	}
}
