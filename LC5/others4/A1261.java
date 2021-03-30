package others4;

public class A1261 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	class FindElements {
		TreeNode root;
		boolean flag;
		int target;

		public FindElements(TreeNode root) {
			dfs(root, 0);
			this.root = root;
		}

		public void dfs(TreeNode root, int val) {
			if (root == null)
				return;
			root.val = val;
			if (root.left != null)
				dfs(root.left, 2 * val + 1);
			if (root.right != null)
				dfs(root.right, 2 * val + 2);
		}

		public boolean find(int target) {
			flag = false;
			this.target = target;
			find_dfs(root);
			return flag;
		}

		public void find_dfs(TreeNode root) {
			if (root == null)
				return;
			if (root.val == target) {
				flag = true;
			}
			if (root.left != null)
				find_dfs(root.left);
			if (root.right != null)
				find_dfs(root.right);
		}
	}

	/**
	 * Your FindElements object will be instantiated and called as such:
	 * FindElements obj = new FindElements(root); boolean param_1 =
	 * obj.find(target);
	 */
}
