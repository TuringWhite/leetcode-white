package others4;

import java.util.HashMap;
import java.util.Map;

public class A951 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	class Solution {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		boolean flag = true;

		public boolean flipEquiv(TreeNode root1, TreeNode root2) {
			dfs(root1, -1);
			checkdfs(root2, -1);
			if (!map.isEmpty())
				flag = false;
			return flag;
		}

		public void dfs(TreeNode root, int pare) {
			if (root == null)
				return;
			map.put(root.val, pare);
			dfs(root.left, root.val);
			dfs(root.right, root.val);

		}

		public void checkdfs(TreeNode root, int pare) {
			if (root == null)
				return;
			if (map.isEmpty()) {
				flag = false;
				return;
			}
			if (map.containsKey(root.val) && map.get(root.val) == pare) {
				map.remove(root.val);
			} else {
				flag = false;
				return;
			}
			checkdfs(root.left, root.val);
			checkdfs(root.right, root.val);
		}
	}
}
