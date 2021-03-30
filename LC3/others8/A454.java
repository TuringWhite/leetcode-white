package others8;

import java.util.HashMap;
import java.util.Map;

public class A454 {
	class Solution {
		public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
			// key是AB数组的值两两组合,value是该值的次数
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			int count = 0;
			for (int a : A) {
				for (int b : B) {
					int sum = a + b;
					if (map.containsKey(sum)) {
						map.replace(sum, map.get(sum) + 1);
					} else {
						map.put(sum, 1);
					}
				}
			}
			for (int c : C) {
				for (int d : D) {
					int sum = 0 - c - d;
					if (map.containsKey(sum))
						count += map.get(sum);
				}
			}
			return count;
		}
	}
}
