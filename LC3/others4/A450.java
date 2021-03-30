package others4;

//1. 如果是空树直接返回。
//2. 然后我们在树上找这个key，如果key不在树上，son将会指向空，注意，如果val==
public class A450 extends Object {
	class Solution {
		public TreeNode deleteNode(TreeNode root, int key) {
			if (root == null)
				return root;
			TreeNode parent = root;
			TreeNode son = root;
			boolean flag = true;// T表示左孩子，F表示右孩子
			while (son != null && son.val != key) {
				parent = son;
				if (son.val < key) {
					son = son.right;
					flag = false;
				} else {
					son = son.left;
					flag = true;
				}
			}
			if (son == null) {
				return root;
			}

			if (son.left == null && son.right == null) {
				if (flag == true) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			} else if (son.left == null) {
				if (flag == true) {
					parent.left = son.right;
				} else {
					parent.right = son.right;
				}
			} else if (son.right == null) {
				if (flag == true) {
					parent.left = son.left;
				} else {
					parent.right = son.left;
				}
			} else {
				if (flag == true) {
					parent.left = son.left;
					parent = parent.left;
				} else {
					parent.right = son.left;
					parent = parent.right;
				}
				while (parent.right != null) {
					parent = parent.right;
				}
				parent.right = son.right;
			}
			if (root.val == key)
				root = root.left;
			return root;
		}
	}
}