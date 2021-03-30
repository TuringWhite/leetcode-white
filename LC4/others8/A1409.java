package others8;

import java.util.ArrayList;
import java.util.List;

public class A1409 {
	class Solution {
		public int[] processQueries(int[] queries, int m) {
			int length = queries.length;
			int[] ans = new int[length];
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i <= m; i++)
				list.add(i + 1);
			for (int i = 0; i < length; i++) {
				int temp = queries[i];
				int index = list.indexOf(temp);
				ans[i] = index;
				list.remove(index);
				list.add(0, temp);
			}
			return ans;
		}
	}
}
