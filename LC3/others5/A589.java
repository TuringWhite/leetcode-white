package others5;

import java.util.ArrayList;
import java.util.List;

public class A589 {
	class Solution {
		List<Integer> list = new ArrayList<Integer>();

		public List<Integer> preorder(Node root) {
			if (root != null) {
				list.add(root.val);
				List<Node> temp = root.children;
				for (int i = 0; i < temp.size(); i++) {
					preorder(temp.get(i));
				}

			}
			return list;
		}
	}
	
	//官方题解的迭代实现
//	class Solution {
//	    public List<Integer> preorder(Node root) {
//	        LinkedList<Node> stack = new LinkedList<>();
//	        LinkedList<Integer> output = new LinkedList<>();
//	        if (root == null) {
//	            return output;
//	        }
//
//	        stack.add(root);
//	        while (!stack.isEmpty()) {
//	            Node node = stack.pollLast();
//	            output.add(node.val);
//	            //这个反转神了，没有用Dequeue
//	            Collections.reverse(node.children);
//	            for (Node item : node.children) {
//	                stack.add(item);
//	            }
//	        }
//	        return output;
//	    }
//	}
}
