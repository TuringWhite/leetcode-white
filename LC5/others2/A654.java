package others2;

public class A654 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	class Solution {
		public TreeNode constructMaximumBinaryTree(int[] nums) {
			TreeNode root = new TreeNode();
			build(root, nums, 0, nums.length - 1);
			return root;
		}

		public void build(TreeNode root, int[] nums, int left, int right) {
			if (left > right) {
				return;
			}
			int max = 0;
			int cur = left;
			for (int i = left; i <= right; i++) {
				if (nums[i] > max) {
					cur = i;
					max = nums[i];
				}
			}
			root.val = max;
			if (left < cur) {
				root.left = new TreeNode();
				build(root.left, nums, left, cur - 1);
			}
			if (cur < right) {
				root.right = new TreeNode();
				build(root.right, nums, cur + 1, right);
			}
		}
	}
}
