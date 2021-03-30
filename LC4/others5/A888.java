package others5;

import java.util.HashSet;
import java.util.Set;

public class A888 {
	class Solution {
		public int[] fairCandySwap(int[] A, int[] B) {
			int[] result = new int[2];
			Set<Integer> set = new HashSet<>();
			int AS = 0, BS = 0;
			for (int num : A)
				AS += num;
			for (int num : B) {
				if (!set.contains(num))
					set.add(num);
				BS += num;
			}
			int temp = (AS - BS) / 2;
			for (int num : A)
				if (set.contains(num - temp)) {
					result[0] = num;
					result[1] = num - temp;
				}
			return result;
		}
	}
}
