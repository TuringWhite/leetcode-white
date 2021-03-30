package others3;

import java.util.ArrayList;
import java.util.List;

public class A894 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	class Solution {
		public List<TreeNode> allPossibleFBT(int N) {
			if (N % 2 == 0) {
				return new ArrayList<>(0);
			}
			List<TreeNode> list = new ArrayList<>();
			if (N == 1) {
				list.add(new TreeNode(0));
				return list;
			}
			N--;
			for (int i = 1; i < N; i += 2) {
				List<TreeNode> left = allPossibleFBT(i);
				List<TreeNode> right = allPossibleFBT(N - i);
				for (TreeNode l : left) {
					for (TreeNode r : right) {
						TreeNode node = new TreeNode(0);
						node.left = l;
						node.right = r;
						list.add(node);
					}
				}
			}
			return list;
		}
	}

}

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
