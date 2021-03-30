package others8;

import java.util.ArrayList;
import java.util.List;

public class A278 {
	class Solution {
		public int kthSmallest(int[][] matrix, int k) {
			List<Integer> list = new ArrayList<Integer>();
			for (int[] child : matrix) {
				for (int i : child) {
					list.add(i);
				}
			}
			list.sort(null);
			return list.get(k - 1);
//			return matrix[(k - 1) / matrix[0].length][(k - 1) % matrix[0].length];
		}
	}
}
