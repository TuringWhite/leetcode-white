package a71_80;

import java.util.HashSet;
import java.util.Set;

public class A73 {

	class Solution {
		public void setZeroes(int[][] matrix) {
			if (matrix.length == 0 || matrix[0].length == 0)
				return;
			Set<Integer> row = new HashSet<>();
			Set<Integer> col = new HashSet<>();
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					if (matrix[i][j] == 0) {
						if (!row.contains(i))
							row.add(i);
						if (!col.contains(j))
							col.add(j);
					}
				}
			}
			for (int num : row) {
				for (int i = 0; i < matrix[0].length; i++) {
					matrix[num][i] = 0;
				}
			}
			for (int num : col) {
				for (int i = 0; i < matrix.length; i++) {
					matrix[i][num] = 0;
				}
			}
		}
	}
//	public static void setZeroes(int[][] matrix) {
//		Set<Integer> row = new HashSet<Integer>();
//		Set<Integer> col = new HashSet<Integer>();
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[0].length; j++) {
//				if (matrix[i][j] == 0) {
//					if (!row.contains(i)) {
//						row.add(i);
//					}
//					if (!col.contains(j)) {
//						col.add(j);
//					}
//				}
//			}
//		}
//		for (Integer integer : col) {
//			for (int i = 0; i < matrix.length; i++) {
//				matrix[i][integer] = 0;
//			}
//		}
//		for (Integer integer : row) {
//			for (int i = 0; i < matrix[0].length; i++) {
//				matrix[integer][i] = 0;
//			}
//		}
//	}

}
