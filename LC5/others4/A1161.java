package others4;

import java.util.LinkedList;
import java.util.Queue;

public class A1161 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	class Solution {
		public int maxLevelSum(TreeNode root) {
			int pre = Integer.MIN_VALUE;
			int sum = 0;
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.offer(root);
			int ans = 0;
			int level = 0;
			while (!queue.isEmpty()) {
				int size = queue.size();
				sum = 0;
				level++;
				for (int i = 0; i < size; i++) {
					TreeNode temp = queue.poll();
					sum += temp.val;
					if (temp.left != null)
						queue.offer(temp.left);
					if (temp.right != null)
						queue.offer(temp.right);
				}
				if (sum > pre) {
					ans = level;
					pre = sum;
				}
			}
			return ans;
		}
	}
}
