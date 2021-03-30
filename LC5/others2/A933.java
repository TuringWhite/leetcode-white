package others2;

import java.util.LinkedList;
import java.util.Queue;

public class A933 {
	class Solution {
		public boolean isCousins(TreeNode root, int x, int y) {
			int depthX = 0;
			int depthY = 0;
			TreeNode pX = null;
			TreeNode pY = null;
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.add(root);
			int depth = 0;
			while (!queue.isEmpty()) {
				int size = queue.size();
				for (int i = 0; i < size; i++) {
					TreeNode temp = queue.poll();
					if (temp.left != null) {
						if (temp.left.val == x) {
							pX = temp;
							depthX = depth + 1;
						}
						if (temp.left.val == y) {
							pY = temp;
							depthY = depth + 1;
						}
						queue.add(temp.left);
					}
					if (temp.right != null) {
						if (temp.right.val == x) {
							pX = temp;
							depthX = depth + 1;
						}
						if (temp.right.val == y) {
							pY = temp;
							depthY = depth + 1;
						}
						queue.add(temp.right);
					}
				}
				depth++;
			}
			if (depthX == depthY && pX.val != pY.val)
				return true;
			return false;
		}
	}
}
