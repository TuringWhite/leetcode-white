package a131_140;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class A133 {
	class Solution {
		public Node cloneGraph(Node node) {
			if (node == null)
				return null;
			Node copy = new Node(node.val);
			help(copy, node);
			return copy;
		}

		public void help(Node copy, Node node) {
			Set<Integer> set = new HashSet<>();
			Stack<Node> stacka = new Stack<>();
			stacka.add(copy);
			Stack<Node> stackb = new Stack<>();
			stackb.add(node);
			while (!stacka.isEmpty()) {
				Node aNode = stacka.pop();
				Node bNode = stackb.pop();
				if (set.contains(aNode.val))
					continue;
				for (Node nei : bNode.neighbors) {
					Node cNode = new Node(nei.val);
					aNode.neighbors.add(cNode);
					stacka.add(cNode);
					stackb.add(nei);
				}
				set.add(aNode.val);
			}
		}
	}
}
