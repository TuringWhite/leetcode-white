package a101_110;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class A110 {
	/*
	 * 
	 * [1,2,3,4,5,6,null,8] [3,9,20,null,null,15,7] [1,2,2,3,3,null,null,4,4] []
	 * [1,2,3] [1,2] [1,2,null,2]
	 * [1,2,null,3,45,null,3,3,4,53,null,3,1,4,null,5,23,4,null,234]
	 */

//	public boolean isBalanced(TreeNode root) {
//
//	}
	// 有点问题，有时间重写
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		Queue<TreeNode> queNode = new LinkedList<TreeNode>();
		Queue<Integer> queStorey = new LinkedList<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		queNode.offer(root);
		queStorey.offer(1);
		while (!queNode.isEmpty()) {
			TreeNode now = queNode.poll();
			int temp = queStorey.poll();
			if (now.left == null && now.right == null) {
				list.add(temp);
				continue;
			}
			if (now.left != null) {
				queNode.offer(now.left);
				queStorey.offer(1 + temp);
			}
			if (now.right != null) {
				queNode.offer(now.right);
				queStorey.offer(1 + temp);
			}
		
		}
		int max = list.get(0);
		int min = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			max = max > list.get(i) ? max : list.get(i);
			min = min < list.get(i) ? min : list.get(i);
		}
		if (max - min >= 2)
			return false;
		return true;
	}
}
