package others6;

import java.util.ArrayList;
import java.util.List;

public class A830 {
	class Solution {
		public List<List<Integer>> largeGroupPositions(String s) {
			List<List<Integer>> result = new ArrayList<List<Integer>>();
			int left = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != s.charAt(left)) {
					if (i >= left + 3) {
						List<Integer> list = new ArrayList<>();
						list.add(left);
						list.add(i - 1);
						result.add(list);
					}
					left = i;
				}
			}
			if (s.length() >= left + 3) {
				List<Integer> list = new ArrayList<>();
				list.add(left);
				list.add(s.length() - 1);
				result.add(list);
			}
			return result;
		}
	}
}
