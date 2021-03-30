package others5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class A429 {
	class Solution {
		public List<List<Integer>> levelOrder(Node root) {

			List<List<Integer>> list = new ArrayList<>();
			if (root == null)
				return list;
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(root);
			queue.add(null);
			List<Integer> child = new ArrayList<>();
			while (!queue.isEmpty()) {
				Node temp = queue.poll();
				if (temp == null) {
					list.add(child);
					child = new ArrayList<>();
					if (queue.isEmpty() || queue.peek() == null) {
						return list;
					}
					queue.add(null);
					continue;
				}
				child.add(temp.val);
				List<Node> nodeChild = temp.children;
				for (int i = 0; i < nodeChild.size(); i++) {
					queue.add(nodeChild.get(i));
				}
			}

			return list;
		}
	}
}
