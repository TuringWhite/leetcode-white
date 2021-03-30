package others1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class A637 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	class Solution {
		public List<Double> averageOfLevels(TreeNode root) {
			List<Double> list = new ArrayList<Double>();
			double sum;
			int count = 0;
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.add(root);

			while (!queue.isEmpty()) {
				sum = 0;
				count = 0;
				int curlevelsize = queue.size();
				for (int i = 0; i < curlevelsize; i++) {
					TreeNode temp = queue.poll();
					sum += temp.val;
					count++;
					if (temp.left != null)
						queue.add(temp.left);
					if (temp.right != null)
						queue.add(temp.right);
				}
				list.add(sum / count);
			}
			return list;
		}
	}
}
