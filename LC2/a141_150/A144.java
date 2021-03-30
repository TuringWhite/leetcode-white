package a141_150;

import java.util.ArrayList;
import java.util.List;

public class A144 {

	public static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> copy = new ArrayList<Integer>();
		if (root == null) {
			return list;
		}
		if (root != null) {
			list.add(root.val);
		}
		if (root.left != null) {
			copy = preorderTraversal(root.left);
			for (int i = 0; i < copy.size(); i++) {
				list.add(copy.get(i));
			}
		}
		if (root.right != null) {
			copy = preorderTraversal(root.right);
			for (int i = 0; i < copy.size(); i++) {
				list.add(copy.get(i));
			}
		}
		
		return list;
	}
}
