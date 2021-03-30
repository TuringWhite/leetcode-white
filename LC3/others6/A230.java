package others6;

import java.util.ArrayList;
import java.util.List;

public class A230 {
	class Solution {
		List<Integer> list = new ArrayList<Integer>();

		public int kthSmallest(TreeNode root, int k) {
			inorder(root);
			int[] arr = new int[list.size()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = list.get(i);
			}
			return arr[k - 1];
		}

		public void inorder(TreeNode root) {
			if (root == null)
				return;
			inorder(root.left);
			list.add(root.val);
			inorder(root.right);
		}
	}
}
