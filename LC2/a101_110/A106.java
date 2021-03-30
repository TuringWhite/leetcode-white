package a101_110;

import java.util.HashMap;
import java.util.Map;

public class A106 {

	class Solution {
		Map<Integer, Integer> map = new HashMap<>();
		int[] inorder;
		int[] postorder;

		public TreeNode buildTree(int[] inorder, int[] postorder) {
			this.inorder = inorder;
			this.postorder = postorder;
			for (int i = 0; i < inorder.length; i++) {
				map.put(inorder[i], i);
			}
			return build(0, inorder.length - 1, 0, postorder.length - 1);
		}

		public TreeNode build(int ileft, int iright, int pleft, int pright) {
			if (pleft > pright) {
				return null;
			}
			int indexroot_p = pright;
			int indexroot_i = map.get(postorder[indexroot_p]);
			TreeNode root = new TreeNode(postorder[indexroot_p]);
			int right_size = iright - indexroot_i;
			root.left = build(ileft, indexroot_i - 1, pleft, pright - right_size - 1);
			root.right = build(indexroot_i + 1, iright, pright - right_size, pright - 1);
			return root;
		}

	}

	// 参数太多了，脑子不够用了，没继续写下去qaq
//	public TreeNode buildTree(int[] inorder, int[] postorder) {
//		int count = 0;
//		TreeNode root = new TreeNode();
//		if (inorder.length == 0) {
//			return root = null;
//		}
//		int i = 0;
//		while (count < inorder.length) {
//			int temp = postorder[postorder.length - 1 - i];
//			root.val = temp;
//			count++;
//			int index;
//			for (int j = 0; j < inorder.length; j++) {
//				if (inorder[j] == temp) {
//					index = j;
//					break;
//				}
//			}
//			makeLeft();
//			makeRight();
//		}
//	}
//
//	public void makeLeft(TreeNode root, int[] inorder, int[] postorder, int start, int end, int i) {
//		if (end - start == 1) {
//			root.left = new TreeNode(postorder[start]);
//		} else {
//			int temp = postorder[end - 1];
//			root.left = new TreeNode(temp);
//
//		}
//	}
//
//	public void makeRight(TreeNode root, int[] inorder, int[] postorder, int start, int end, int i) {
//		if (end - start == 1) {
//			root.right = new TreeNode(inorder[start]);
//		}
//	}
}

class Solution1 {
	int post_idx;
	int[] postorder;
	int[] inorder;
	Map<Integer, Integer> idx_map = new HashMap<Integer, Integer>();

	public TreeNode helper(int in_left, int in_right) {
		// 如果这里没有节点构造二叉树了，就结束
		if (in_left > in_right) {
			return null;
		}

		// 选择 post_idx 位置的元素作为当前子树根节点
		int root_val = postorder[post_idx];
		TreeNode root = new TreeNode(root_val);

		// 根据 root 所在位置分成左右两棵子树
		int index = idx_map.get(root_val);

		// 下标减一
		post_idx--;
		// 构造右子树
		root.right = helper(index + 1, in_right);
		// 构造左子树
		root.left = helper(in_left, index - 1);
		return root;
	}

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		this.postorder = postorder;
		this.inorder = inorder;
		// 从后序遍历的最后一个元素开始
		post_idx = postorder.length - 1;

		// 建立（元素，下标）键值对的哈希表
		int idx = 0;
		for (Integer val : inorder) {
			idx_map.put(val, idx++);
		}

		return helper(0, inorder.length - 1);
	}
}
