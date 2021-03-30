package others9;

import java.util.ArrayList;
import java.util.List;

public class A779 {
	class Solution {
		public int kthGrammar(int N, int K) {
			if (N == 1)
				return 0;
			List<Boolean> list1 = new ArrayList<>();
			List<Boolean> list2 = new ArrayList<>();
			list1.add(false);
			for (int i = 2; i <= N; i++) {
				for (int j = 0; j < list1.size(); j++) {
					if (list1.get(j) == true) {
						list2.add(true);
						list2.add(false);
					} else {
						list2.add(false);
						list2.add(true);
					}
				}
				list1 = list2;
				list2 = new ArrayList<>();
			}
			return list1.get(K - 1) == true ? 1 : 0;
		}
	}
}
