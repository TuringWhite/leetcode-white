package others3;

import java.util.ArrayList;
import java.util.List;

public class A1305 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	class Solution {
		List<Integer> list = new ArrayList<Integer>();

		public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

			dfs(root1);
			dfs(root2);
			list.sort(null);
			return list;
		}

		public void dfs(TreeNode root) {
			if (root == null)
				return;
			dfs(root.left);
			list.add(root.val);
			dfs(root.right);
		}
	}

}
