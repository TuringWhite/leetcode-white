package others2;

public class A226 {
	public static TreeNode invertTree(TreeNode root) {
		if (root == null)
			return root;
		else {
			reverseTree(root);
		}
		return root;
	}

	public static void reverseTree(TreeNode root) {
		if (root == null)
			return;
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		reverseTree(root.left);
		reverseTree(root.right);
	}
}
