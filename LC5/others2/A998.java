package others2;

public class A998 {
	class Solution {
		public TreeNode insertIntoMaxTree(TreeNode root, int val) {
			if (root == null || root.val < val) {
				TreeNode tmp = new TreeNode(val);
				tmp.left = root;
				return tmp;
			}
			TreeNode right = insertIntoMaxTree(root.right, val);
			root.right = right;
			return root;
		}
	}

}
