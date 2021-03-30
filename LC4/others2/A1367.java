package others2;

public class A1367 {
	class Solution {
		public boolean isSubPath(ListNode head, TreeNode root) {
			if (head == null && root == null)
				return true;
			if (head == null || root == null)
				return false;
			return dfs(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
		}

		private boolean dfs(ListNode head, TreeNode root) {
			if (head == null)
				return true;
			if (head != null && root == null)
				return false;
			if (root.val == head.val) {
				return dfs(head.next, root.left) || dfs(head.next, root.right);
			}
			return false;
		}
//		一个细节判断不够充分的dfs，自己写的
//		boolean flag = false;
//
//		public boolean isSubPath(ListNode head, TreeNode root) {
//			help(head, root, true);
//			return flag;
//		}
//
//		public void help(ListNode head, TreeNode root, boolean con) {
//			if (head == null) {
//				flag = true;
//				return;
//			}
//			if (root == null)
//				return;
//			if (head.val == root.val) {
//				help(head.next, root.left, false);
//				help(head.next, root.right, false);
//				help(head, root.left, true);
//				help(head, root.right, true);
//			} else if (con == true) {
//				help(head, root.left, true);
//				help(head, root.right, true);
//			}
//		}
	}
}
