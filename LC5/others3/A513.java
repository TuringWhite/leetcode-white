package others3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A513 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	class Solution {
		List<Integer> val = new ArrayList<Integer>();
		List<Integer> dep = new ArrayList<>();

		public int findBottomLeftValue(TreeNode root) {
			dfs(root, 0);
			int max = Collections.max(dep);
			for (int i = 0; i < dep.size(); i++) {
				if (dep.get(i) == max)
					return val.get(i);
			}
			return -1;
		}

		public void dfs(TreeNode root, int depth) {
			if (root == null)
				return;
			if (root.left == null && root.right == null) {
				val.add(root.val);
				dep.add(depth);
			}
			dfs(root.left, depth + 1);

			dfs(root.right, depth + 1);
		}
	}
}
