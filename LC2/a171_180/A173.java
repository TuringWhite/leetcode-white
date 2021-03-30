package a171_180;

import java.util.Stack;

public class A173 {
	// 自己写的，有问题，明明是个中序遍历，拿栈实现，出现了问题
//	class BSTIterator {
//		Stack<TreeNode> path;
//
//		public BSTIterator(TreeNode root) {
//			path = new Stack<TreeNode>();
//			path.push(root);
//		}
//
//		/** @return the next smallest number */
//		public int next() {
//			TreeNode temp = path.peek();
//			if (temp.right != null) {
//				path.pop();
//				path.push(temp.right);
//				return temp.val;
//			} else if (temp.right == null && temp.left == null) {
//				path.pop();
//				return next();
//			}
//
//			if (temp.left != null) {
//				path.add(temp.left);
//			} else {
//				return path.pop().val;
//			}
//		}
//
//		/** @return whether we have a next smallest number */
//		public boolean hasNext() {
//			if (!path.isEmpty()) {
//				return true;
//			} else {
//				return false;
//			}
//		}
//	}

	class BSTIterator {

		Stack<TreeNode> stack;

		public BSTIterator(TreeNode root) {

			// Stack for the recursion simulation
			this.stack = new Stack<TreeNode>();

			// Remember that the algorithm starts with a call to the helper function
			// with the root node as the input
			this._leftmostInorder(root);
		}

		private void _leftmostInorder(TreeNode root) {

			// For a given node, add all the elements in the leftmost branch of the tree
			// under it to the stack.
			while (root != null) {
				this.stack.push(root);
				root = root.left;
			}
		}

		public int next2() {
			TreeNode temp = stack.pop();
			if (temp.right != null) {
				stack.push(temp.right);
				temp.right = temp.right.left;
			}

			return temp.val;
		}

		/**
		 * @return the next smallest number
		 */
		public int next() {
			// Node at the top of the stack is the next smallest element
			TreeNode topmostNode = this.stack.pop();

			// Need to maintain the invariant. If the node has a right child, call the
			// helper function for the right child
			if (topmostNode.right != null) {
				this._leftmostInorder(topmostNode.right);
			}

			return topmostNode.val;
		}

		/**
		 * @return whether we have a next smallest number
		 */
		public boolean hasNext() {
			return this.stack.size() > 0;
		}
	}

}
