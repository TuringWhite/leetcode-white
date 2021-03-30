package others1;

import java.util.ArrayList;
import java.util.List;

public class A530 {
	class Solution {
		List<Integer> list;

		public int getMinimumDifference(TreeNode root) {
			int min = Integer.MAX_VALUE;
			list = new ArrayList<Integer>();
			inorder(root);
			for (int i = 1; i < list.size(); i++) {
				min = Math.min(min, list.get(i) - list.get(i - 1));
			}
			return min;
		}

		public void inorder(TreeNode root) {
			if (root.left != null)
				inorder(root.left);
			list.add(root.val);
			if (root.right != null)
				inorder(root.right);
		}
	}
}
