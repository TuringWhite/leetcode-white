package others1;

public class A783 {
	class Solution {
		int ans;
		int pre;

		public int minDiffInBST(TreeNode root) {
			ans = Integer.MAX_VALUE;
			pre = Integer.MAX_VALUE;
			dfs(root);
			return ans;
		}

		public void dfs(TreeNode root) {
			if (root.left != null)
				dfs(root.left);
			if (pre != Integer.MAX_VALUE) {
				ans = Math.min(ans, root.val - pre);
			}
			pre = root.val;
			if (root.right != null) {
				dfs(root.right);
			}
		}
	}
}
