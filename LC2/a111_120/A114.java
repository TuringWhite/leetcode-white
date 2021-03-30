package a111_120;

import java.util.ArrayList;
import java.util.List;

public class A114 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	class Solution {
		List<TreeNode> list;

		public void flatten(TreeNode root) {
			list = new ArrayList<TreeNode>();
			dfs(root);
			TreeNode cur = root;
			for (int i = 1; i < list.size(); i++) {
				cur.left = null;
				cur.right = list.get(i);
				cur = cur.right;
			}
		}

		public void dfs(TreeNode root) {
			if (root == null)
				return;
			list.add(root);
			dfs(root.left);
			dfs(root.right);
		}
	}
}
