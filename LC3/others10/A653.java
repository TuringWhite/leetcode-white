package others10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A653 {
	class Solution {
		Map<String, Integer> count = new HashMap<>();
		List<TreeNode> ans = new ArrayList<>();

		public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

			collect(root);
			return ans;
		}

		public String collect(TreeNode node) {
			if (node == null)
				return "#";
			String serial = node.val + "," + collect(node.left) + "," + collect(node.right);
			count.put(serial, count.getOrDefault(serial, 0) + 1);
			if (count.get(serial) == 2)
				ans.add(node);
			return serial;
		}
	}

	// 一个非常烂的算法。而且现在还没通过
//	class Solution {
//		Set<TreeNode> result = new HashSet<>();
//		Set<TreeNode> set = new HashSet<>();
//
//		public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
//			help(root);
//			List<TreeNode> list = new ArrayList<>();
//			for (TreeNode node : result) {
//				list.add(node);
//			}
//			return list;
//		}
//
//		public void help(TreeNode root) {
//			if (root == null)
//				return;
//			System.out.println(root.val);
//			boolean flag1 = true, flag2 = true;
//			for (TreeNode pNode : set) {
//				if (isSameTree(pNode, root)) {
//					flag1 = false;
//				}
//			}
//			if (flag1) {
//				for (TreeNode qNode : result) {
//					if (isSameTree(qNode, root)) {
//						flag2 = false;
//					}
//				}
//			} else {
//				set.add(root);
//			}
//			if (!set.isEmpty() && flag2) {
//				result.add(root);
//				return;
//			}
//			if (set.isEmpty()) {
//				set.add(root);
//			}
//			help(root.left);
//			help(root.right);
//		}
//
//		public boolean isSameTree(TreeNode p, TreeNode q) {
//			if (p == null && q == null) {
//				return true;
//			} else if (p == null || q == null) {
//				return false;
//			}
//			if (p.val == q.val) {
//				return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//			} else {
//				return false;
//			}
//		}
//	}
}
