package a141_150;

import java.util.ArrayList;
import java.util.List;

public class A145 {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> copy = new ArrayList<Integer>();
		if (root == null) {
			return list;
		}
		if (root.left != null) {
			copy = postorderTraversal(root.left);
			for (int i = 0; i < copy.size(); i++) {
				list.add(copy.get(i));
			}
		}

		if (root.right != null) {
			copy = postorderTraversal(root.right);
			for (int i = 0; i < copy.size(); i++) {
				list.add(copy.get(i));
			}
		}
		if (root != null) {
			list.add(root.val);
		}

		return list;
	}
}
