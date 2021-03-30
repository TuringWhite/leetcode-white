package others2;

import java.util.LinkedList;
import java.util.Queue;

public class A572 {
	class Solution {

		public boolean isSubtree(TreeNode s, TreeNode t) {
			boolean flag = false;
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.add(s);
			while (!queue.isEmpty()) {
				int size = queue.size();
				for (int i = 0; i < size; i++) {
					TreeNode temp = queue.poll();
					if (temp.val == t.val) {
						flag = dfs(temp, t);
					}
					if (flag)
						return flag;
					if (temp.left != null)
						queue.add(temp.left);
					if (temp.right != null)
						queue.add(temp.right);
				}
			}
			return false;
		}

		public boolean dfs(TreeNode s, TreeNode t) {
			if (s == null && t == null)
				return true;
			if (s != null && t == null)
				return false;
			if (s == null && t != null)
				return false;
			if (s.val != t.val)
				return false;
			return dfs(s.left, t.left) && dfs(s.right, t.right);
		}
	}
}
