package others4;

public class A701 {
	class Solution {
		public TreeNode insertIntoBST(TreeNode root, int val) {
			if (root == null) {
				root = new TreeNode(val);
				return root;
			}
			TreeNode tag = root;
			while (!((root.left == null && root.val > val) || (root.right == null && root.val < val))) {
				if (root.val > val) {
					root = root.left;
				} else {
					root = root.right;
				}
			}
			System.out.println(root.val);
			if (root.val > val) {

				TreeNode soNode = new TreeNode(val);
				root.left = soNode;

			} else {

				TreeNode soNode = new TreeNode(val);
				root.right = soNode;

			}
			return tag;
		}
	}
}
