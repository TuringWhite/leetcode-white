package others3;

import java.util.ArrayList;
import java.util.List;

public class A437 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	class Solution {
		int ans;
		int sum;

		public int pathSum(TreeNode root, int sum) {
			if (root == null)
				return 0;
			ans = 0;
			this.sum = sum;
			dfs(root);
			return ans;
		}

		public List<Integer> dfs(TreeNode root) {
			if (root.left == null && root.right == null) {
				List<Integer> temp = new ArrayList<Integer>();
				temp.add(root.val);
				if (root.val == sum)
					ans++;
				return temp;
			}
			List<Integer> left = null;
			List<Integer> right = null;
			if (root.left != null)
				left = dfs(root.left);
			if (root.right != null)
				right = dfs(root.right);
			List<Integer> temp = new ArrayList<>();
			if (left != null)
				temp.addAll(left);
			if (right != null)
				temp.addAll(right);
			for (int i = 0; i < temp.size(); i++) {
				temp.set(i, temp.get(i) + root.val);
				if (temp.get(i) == sum)
					ans++;
			}
			temp.add(root.val);
			if (root.val == sum)
				ans++;
			return temp;
		}
	}
}
