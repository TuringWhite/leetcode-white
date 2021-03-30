package others3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class A515 {
	class Solution {
		public List<Integer> largestValues(TreeNode root) {
			List<Integer> ans = new ArrayList<Integer>();
			if (root == null)
				return ans;
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.offer(root);
			while (!queue.isEmpty()) {
				int size = queue.size();
				int max = Integer.MIN_VALUE;
				for (int i = 0; i < size; i++) {
					TreeNode temp = queue.poll();
					max = max > temp.val ? max : temp.val;
					if (temp.left != null)
						queue.offer(temp.left);
					if (temp.right != null)
						queue.offer(temp.right);
				}
				ans.add(max);
			}
			return ans;
		}
	}
}
