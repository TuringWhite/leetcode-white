package others4;

public class A1448 {
	class Solution {
		int ans;

		public int goodNodes(TreeNode root) {
			ans = 0;
			if (root == null)
				return ans;
			dfs(root, Integer.MIN_VALUE);
			return ans;
		}

		public void dfs(TreeNode root, int max) {
			if (root.val >= max) {
				ans++;
				max = root.val;
			}
			if (root.left != null)
				dfs(root.left, max);
			if (root.right != null)
				dfs(root.right, max);
		}
	}
}
