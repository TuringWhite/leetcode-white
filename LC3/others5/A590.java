package others5;

import java.util.ArrayList;
import java.util.List;

public class A590 {
	class Solution {
		List<Integer> list = new ArrayList<Integer>();

		public List<Integer> postorder(Node root) {
			if (root != null) {
				List<Node> temp = root.children;
				for (int i = 0; i < temp.size(); i++) {
					postorder(temp.get(i));
				}
				list.add(root.val);

			}
			return list;
		}
	}
	
}
