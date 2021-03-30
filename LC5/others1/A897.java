package others1;

import java.util.ArrayList;
import java.util.List;

public class A897 {
	class Solution {
		List<Integer> list;

		public TreeNode increasingBST(TreeNode root) {
			list = new ArrayList<Integer>();
			preorder(root);
			TreeNode dummy = new TreeNode();
			TreeNode cur = dummy;
			dummy.right = cur;
			for (int num : list) {
				cur.right = new TreeNode(num);
				cur = cur.right;
			}
			return dummy.right;
		}

		public void preorder(TreeNode root) {
			if (root.left != null)
				preorder(root.left);
			list.add(root.val);
			if (root.right != null) {
				preorder(root.right);
			}
		}
	}
}
