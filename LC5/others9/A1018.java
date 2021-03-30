package others9;

import java.util.ArrayList;
import java.util.List;

public class A1018 {
	class Solution {
		public List<Boolean> prefixesDivBy5(int[] A) {
			int num = 0;
			List<Boolean> list = new ArrayList<Boolean>();
			for (int i = 0; i < A.length; i++) {
				num = (num * 2 + A[i]) % 5;
				if (num == 0) {
					list.add(true);
				} else {
					list.add(false);
				}
			}
			return list;

		}
	}

}
