package a191_200;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class A199 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	class Solution {

		public List<Integer> rightSideView(TreeNode root) {

			List<Integer> list = new ArrayList<Integer>();
			if (root == null)
				return list;
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.offer(root);
			while (!queue.isEmpty()) {
				int size = queue.size();
				for (int i = 0; i < size; i++) {
					TreeNode temp = queue.poll();
					if (i == 0)
						list.add(temp.val);
					if (temp.right != null)
						queue.offer(temp.right);
					if (temp.left != null)
						queue.offer(temp.left);
				}
			}
			return list;
		}

	}
}
