package others5;

import java.util.List;

public class A559 {
	class Solution {
		public int maxDepth(Node root) {
			if (root == null)
				return 0;
			if (root.children == null)
				return 1;
			List<Node> list = root.children;
			int max = 0;
			for (int i = 0; i < list.size(); ++i) {
				int temp = maxDepth(list.get(i));
				if (max < temp)
					max = temp;
			}
			return max + 1;
		}
	}
}
