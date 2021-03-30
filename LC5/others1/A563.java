package others1;

public class A563 {

	// 有个用例跑不过 [-8,3,0,-8,null,null,null,null,-1,null,8]
//	class Solution {
//		int sum;
//
//		public int findTilt(TreeNode root) {
//			if (root == null)
//				return 0;
//			SumTree(root);
//			sum = 0;
//			calculateTree(root);
//			return sum;
//		}
//
//		public int SumTree(TreeNode root) {
//			int temp = root.val;
//			if (root.left != null) {
//				temp += SumTree(root.left);
//			}
//			if (root.right != null) {
//				temp += SumTree(root.right);
//			}
//			root.val = temp;
//			return temp;
//		}
//
//		public void calculateTree(TreeNode root) {
//			if (root.left != null && root.right != null) {
//				sum += Math.abs(root.right.val - root.left.val);
//				calculateTree(root.left);
//				calculateTree(root.right);
//			} else if (root.left != null) {
//				sum += root.left.val;
//				calculateTree(root.left);
//			} else if (root.right != null) {
//				sum += root.right.val;
//				calculateTree(root.right);
//			}
//		}
//	}
}

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */

class Solution {
	int tilt = 0;

	public int findTilt(TreeNode root) {
		traverse(root);
		return tilt;
	}

	public int traverse(TreeNode root) {
		if (root == null)
			return 0;
		int left = traverse(root.left);
		int right = traverse(root.right);
		tilt += Math.abs(left - right);
		return left + right + root.val;
	}
}
