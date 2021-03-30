package others1;

import java.util.LinkedList;
import java.util.Queue;

public class A1022 {
	class Solution {
		public int sumRootToLeaf(TreeNode root) {
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			Queue<Integer> values = new LinkedList<>();
			queue.add(root);
			values.add(0);
			int sum = 0;
			while (!queue.isEmpty()) {
				int size = queue.size();
				for (int i = 0; i < size; i++) {
					TreeNode temp = queue.poll();
					int value = values.poll();
					if (temp.left == null && temp.right == null) {
						sum += (value << 1) + temp.val;
					} else {
						if (temp.left != null) {
							queue.add(temp.left);
							values.add((value << 1) + temp.val);
						}
						if (temp.right != null) {
							queue.add(temp.right);
							values.add((value << 1) + temp.val);
						}
					}
				}
			}
			return sum;
		}
	}
}
