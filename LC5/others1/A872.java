package others1;

import java.util.ArrayList;
import java.util.List;

public class A872 {
	class Solution {
		public boolean leafSimilar(TreeNode root1, TreeNode root2) {
			List<Integer> list1 = new ArrayList<Integer>();
			List<Integer> list2 = new ArrayList<>();
			dfs(root1, list1);
			dfs(root2, list2);
			return list1.equals(list2);
		}

		public void dfs(TreeNode root, List<Integer> list) {
			if (root.left == null && root.right == null) {
				list.add(root.val);
			}
			if (root.left != null)
				dfs(root.left, list);
			if (root.right != null)
				dfs(root.right, list);
		}
	}
}
