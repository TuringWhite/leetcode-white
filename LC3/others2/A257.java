package others2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class A257 {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList<String>();
		Queue<TreeNode> queRoot = new LinkedList<TreeNode>();
		Queue<String> quePath = new LinkedList<String>();
		if (root == null)
			return list;
		else {
			queRoot.add(root);
			quePath.add(root.val + "");
			while (!queRoot.isEmpty()) {
				TreeNode temp = queRoot.poll();
				String path = quePath.poll();
				if (temp.left != null) {
					queRoot.add(temp.left);
					quePath.add(new StringBuffer(path).append("->").append(temp.left.val).toString());
				}
				if (temp.right != null) {
					queRoot.add(temp.right);
					quePath.add(new StringBuffer(path).append("->").append(temp.right.val).toString());
				}
				if (temp.left == null && temp.right == null) {
					list.add(path);
				}
			}
		}
		return list;
	}
}
