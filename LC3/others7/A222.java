package others7;

public class A222 {
	class Solution {
		int count = 0;

		public int countNodes(TreeNode root) {
			if (root == null)
				return count;
			else {
				count++;
				countNodes(root.left);
				countNodes(root.right);
				return count;
			}

		}
	}
}
