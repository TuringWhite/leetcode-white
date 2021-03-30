package others2;

public class A1379 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */

	class Solution {
		TreeNode ans;

		public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
			dfs(cloned, target);
			return ans;
		}

		public void dfs(final TreeNode cloned, final TreeNode target) {
			if (cloned == null)
				return;
			if (cloned.val == target.val) {
				ans = cloned;
				return;
			}
			dfs(cloned.left, target);
			dfs(cloned.right, target);
		}
	}
}
