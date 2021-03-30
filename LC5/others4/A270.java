package others4;

public class A270 {
	class Solution {
		double abs = Double.MAX_VALUE;
		int res = Integer.MAX_VALUE;
		double target;

		public int closestValue(TreeNode root, double target) {
			this.target = target;
			dfs(root);
			System.out.println(abs);
			return res;
		}

		public void dfs(TreeNode root) {
			if (root == null)
				return;
			double temp = root.val - target;
			if (temp < 0)
				temp = -temp;
			if (temp < abs) {
				res = root.val;
				abs = temp;
			}
			if (root.val - target > 0) {
				dfs(root.left);
			} else if (root.val - target < 0) {
				dfs(root.right);
			} else {
				return;
			}
		}
	}
}
