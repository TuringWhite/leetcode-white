package a111_120;

import java.util.LinkedList;
import java.util.Queue;

public class A117 {
	public Node connect(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		queue.add(null);
		Node pre = null;
		Node cur = null;
		while (!queue.isEmpty()) {
			cur = queue.poll();
			if (cur == null) {
				if (queue.peek() == null)
					break;
				else {
					pre = null;
					queue.add(null);
					continue;
				}
			}
			if (pre != null)
				pre.next = cur;
			if (cur.left != null)
				queue.add(cur.left);
			if (cur.right != null)
				queue.add(cur.right);
			pre = cur;
		}

		return root;

	}
}
