package a91_100;

import java.util.ArrayList;
import java.util.List;

public class A94 {
    public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> copy = new ArrayList<Integer>();
		if (root == null) {
			return list;
		}
		if (root.left != null) {
			copy = inorderTraversal(root.left);
			for (int i = 0; i < copy.size(); i++) {
				list.add(copy.get(i));
			}
		}
		if (root != null) {
			list.add(root.val);
		}
		if (root.right != null) {
			copy = inorderTraversal(root.right);
			for (int i = 0; i < copy.size(); i++) {
				list.add(copy.get(i));
			}
		}

		return list;
    }
}
