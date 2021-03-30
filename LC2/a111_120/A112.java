package a111_120;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class A112 {

//	[5,4,8,11,null,13,4,7,2,null,null,null,1]
//			22
//			[1,2,3,4,4,5,6,7,6,5]
//			12
//			[1,2,3,4,4,5,6,7,6,5]
//					14,15,12,9,10
	public boolean hasPathSum(TreeNode root, int sum) {
		List<Integer> last = new ArrayList<Integer>();
		if (root == null)
			return false;
		Queue<TreeNode> prev = new LinkedList<TreeNode>();
		Queue<TreeNode> next;
		prev.add(root);
		while (!prev.isEmpty()) {
			next = new LinkedList<TreeNode>();
			while (!prev.isEmpty()) {
				TreeNode temp = prev.poll();
				if (temp.left != null) {
					temp.left.val += temp.val;
					next.add(temp.left);
				}
				if (temp.right != null) {
					next.add(temp.right);
					temp.right.val += temp.val;
				}
				if (temp.left == null && temp.right == null)
					last.add(temp.val);
			}
			prev = next;
		}
		if (last.contains(sum)) {
			return true;
		} else {
			return false;
		}
	}

}

//public static boolean SumSomeNode(TreeNode root, int sum) {
//	// 自上而下，逐个求和，如果有我就return
//	boolean b1, b2, b3, b4;
//	b1 = b2 = b3 = b4 = false;
//	if (root.left != null) {
//		root.left.val += root.val;
//		if (root.left.val == sum) {
//			b1 = true;
//		} else if (root.left.val < sum) {
//			b2 = SumSomeNode(root.left, sum);
//		}
//	}
//	if (root.right != null) {
//		root.right.val += root.val;
//		if (root.right.val == sum) {
//			b3 = true;
//		} else if (root.right.val < sum) {
//			b4 = SumSomeNode(root.right, sum);
//		}
//	}
//	if (b1 || b2 || b3 || b4) {
//		return true;
//	} else {
//		return false;
//	}
//
//}
//public static boolean SumSomeNode(TreeNode root, int sum) {
//	// 自上而下，逐个求和，如果有我就return
//	if (root.left != null) {
//		root.left.val += root.val;
//		if (root.left.val == sum) {
//			return true;
//		} else if (root.left.val < sum) {
//			return SumSomeNode(root.left, sum);
//		}
//	}
//	if (root.right != null) {
//		root.right.val += root.val;
//		if (root.right.val == sum) {
//			return true;
//		} else if (root.right.val < sum) {
//			return SumSomeNode(root.right, sum);
//		}
//	}
//	return false;
//}