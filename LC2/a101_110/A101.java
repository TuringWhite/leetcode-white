package a101_110;

public class A101 {
//明早再写
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode l1 = new TreeNode(2);
		TreeNode l2 = new TreeNode(2);
		TreeNode l3 = new TreeNode(3);
		TreeNode l4 = new TreeNode(3);
		root.left = l1;
		root.right = l2;
		l1.right = l3;
		l2.right = l4;

//		System.out.println(list.size());
	}

	public static boolean isSymmetric(TreeNode root) {

		if (root == null) {
			return true;
		}
		return isDuiChen(root.left, root.right);
	}

	public static Boolean isDuiChen(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		} else if (left == null && right != null) {
			return false;
		} else if (left != null && right == null) {
			return false;
		}
		if (left.val != right.val)
			return false;
		else if (left != null && right != null) {
			if (!isDuiChen(left.left, right.right))
				return false;
			if (!isDuiChen(left.right, right.left))
				return false;
		}
		return true;

	}

}
