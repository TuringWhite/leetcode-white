package a101_110;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class A102 {
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		if (root == null)
			return output;
		Queue<TreeNode> prev = new LinkedList<TreeNode>();
		Queue<TreeNode> next;
		prev.add(root);
		while (!prev.isEmpty()) {
			next = new LinkedList<TreeNode>();
			List<Integer> list = new ArrayList<Integer>();
			while (!prev.isEmpty()) {
				TreeNode temp = prev.poll();
				list.add(temp.val);
				if (temp.left != null)
					next.add(temp.left);
				if (temp.right != null)
					next.add(temp.right);
			}
			output.add(list);
			prev = next;
		}

		return output;
	}
}
