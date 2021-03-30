package others3;

import java.util.LinkedList;
import java.util.Queue;

public class A1302 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	class Solution {
		public int deepestLeavesSum(TreeNode root) {
			int sum = 0;
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.offer(root);
			while (!queue.isEmpty()) {
				int size = queue.size();
				sum = 0;
				for (int i = 0; i < size; i++) {
					TreeNode temp = queue.poll();
					sum += temp.val;
					if (temp.left != null)
						queue.offer(temp.left);
					if (temp.right != null)
						queue.offer(temp.right);
				}
			}
			return sum;
		}
	}
}
