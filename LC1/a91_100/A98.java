package a91_100;

public class A98 {
	// 先中序遍历，然后再检查这个array有没有问题，是不是单调增
//	public boolean isValidBST(TreeNode root) {
//		List<Integer> list = inorderTraversal(root);
//		for (int i = 0; i < list.size() - 1; i++) {
//			if (list.get(i) > list.get(i + 1))
//				return false;
//		}
//		return true;
//	}
//
//	public static List<Integer> inorderTraversal(TreeNode root) {
//		List<Integer> list = new ArrayList<Integer>();
//		List<Integer> copy = new ArrayList<Integer>();
//		if (root == null) {
//			return list;
//		}
//		if (root.left != null) {
//			copy = inorderTraversal(root.left);
//			for (int i = 0; i < copy.size(); i++) {
//				list.add(copy.get(i));
//			}
//		}
//		if (root != null) {
//			list.add(root.val);
//		}
//		if (root.right != null) {
//			copy = inorderTraversal(root.right);
//			for (int i = 0; i < copy.size(); i++) {
//				list.add(copy.get(i));
//			}
//		}
//
//		return list;
//	}
}
