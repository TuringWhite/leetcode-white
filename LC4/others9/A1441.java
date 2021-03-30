package others9;

import java.util.ArrayList;
import java.util.List;

public class A1441 {
	class Solution {
		public List<String> buildArray(int[] target, int n) {
			List<String> ans = new ArrayList<String>();
			int cur = 0;
			for (int i = 1; i <= n && cur < target.length; i++) {
				if (target[cur] == i) {
					cur++;
					ans.add("Push");
				} else {
					ans.add("Push");
					ans.add("Pop");
				}
			}
			return ans;
		}
	}
}
