package a111_120;

import java.util.LinkedList;
import java.util.Queue;

public class A111 {
//	public int minDepth(TreeNode root) {
//		if (root == null)
//			return 0;
//		if (root.left == null && root.right == null) {
//			return 1;
//		} else if (root.left == null) {
//			return minDepth(root.right) + 1;
//		} else if (root.right == null) {
//			return minDepth(root.left) + 1;
//		} else {
//			return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
//		}
//	}
	public int minDepth(TreeNode root) {
		Queue<TreeNode> queRoot = new LinkedList<TreeNode>();
		Queue<Integer> queStorey = new LinkedList<Integer>();
		if (root == null)
			return 0;
		queRoot.add(root);
		queStorey.add(1);
		while (!queRoot.isEmpty()) {
			TreeNode temp = queRoot.poll();
			int storey = queStorey.poll();
			if (temp.left == null && temp.right == null) {
				return storey + 1;
			}
			if (temp.left != null) {
				queRoot.add(temp.left);
				queStorey.add(storey + 1);
			}
			if (temp.right != null) {
				queRoot.add(temp.right);
				queStorey.add(storey + 1);
			}
		}
		return Integer.MAX_VALUE;
	}
}
