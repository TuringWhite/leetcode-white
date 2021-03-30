package a101_110;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class A103 {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		if (root == null)
			return output;
		Queue<TreeNode> prev = new LinkedList<TreeNode>();
		Stack<TreeNode> nextStack = new Stack<TreeNode>();
		prev.add(root);
		int i = 1;
		while (!prev.isEmpty() || !nextStack.isEmpty()) {
			List<Integer> list = new ArrayList<Integer>();
			if (i == 1) {
				while (!prev.isEmpty()) {
					TreeNode temp = prev.poll();
					list.add(temp.val);
					if (temp.left != null)
						nextStack.add(temp.left);
					if (temp.right != null)
						nextStack.add(temp.right);
				}
			} else {
				while (!nextStack.isEmpty()) {
					TreeNode temp = nextStack.pop();
					list.add(temp.val);
					if (temp.left != null)
						prev.add(temp.left);
					if (temp.right != null)
						prev.add(temp.right);
				}
			}
			i = (i + 1) % 2;
			output.add(list);
		}
		return output;
	}
}
