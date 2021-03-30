package a51_60;

import java.util.ArrayList;
import java.util.List;

public class A54 {

	class Solution {
		public List<Integer> spiralOrder(int[][] matrix) {
			List<Integer> ans = new ArrayList<>();
			if (matrix.length == 0 || matrix[0].length == 0)
				return ans;
			int top = 0, bottom = matrix.length - 1;
			int left = 0, right = matrix[0].length - 1;
			int count = matrix.length * matrix[0].length;
			while (ans.size() < count) {
				System.out.println(ans.size());
				for (int i = left; i < right; i++) {
					ans.add(matrix[top][i]);
				}
				for (int i = top; i <= bottom; i++) {
					ans.add(matrix[i][right]);
				}
				if (ans.size() >= count)
					break;
				for (int i = right - 1; i > left; i--) {
					ans.add(matrix[bottom][i]);
				}
				for (int i = bottom; i > top; i--) {
					ans.add(matrix[i][left]);
				}
				top++;
				bottom--;
				left++;
				right--;
			}
			return ans;
		}
	}
//	class Solution {
//		public List<Integer> spiralOrder(int[][] matrix) {
//			List<Integer> list = new ArrayList<Integer>();
//			int t = 0, b = matrix.length - 1, l = 0, r = matrix[0].length - 1;
//			while (t <= b && l <= r) {
//				for (int i = l; i <= r; i++) {
//					list.add(matrix[t][i]);
//				}
//				for (int i = t + 1; i <= b; i++) {
//					list.add(matrix[i][r]);
//				}
//				if (t < b && l < r) {
//					for (int i = r - 1; i > l; i--) {
//						list.add(matrix[b][i]);
//					}
//					for (int i = b; i > t; i--) {
//						list.add(matrix[i][l]);
//					}
//				}
//				t++;
//				b--;
//				l++;
//				r--;
//			}
//
////			while (list.size() > matrix.length * matrix[0].length) {
////				list.remove(list.size() - 1);
////			}
////			if (list.size() != matrix.length * matrix[0].length) {
////				list.add(matrix[matrix.length / 2][matrix[0].length / 2]);
////			}
//			return list;
//		}
//	}
//}
//
//class Solution {
//	public List<Integer> spiralOrder(int[][] matrix) {
//		List<Integer> order = new ArrayList<Integer>();
//		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//			return order;
//		}
//		int rows = matrix.length, columns = matrix[0].length;
//		int left = 0, right = columns - 1, top = 0, bottom = rows - 1;
//		while (left <= right && top <= bottom) {
//			for (int column = left; column <= right; column++) {
//				order.add(matrix[top][column]);
//			}
//			for (int row = top + 1; row <= bottom; row++) {
//				order.add(matrix[row][right]);
//			}
//			if (left < right && top < bottom) {
//				for (int column = right - 1; column > left; column--) {
//					order.add(matrix[bottom][column]);
//				}
//				for (int row = bottom; row > top; row--) {
//					order.add(matrix[row][left]);
//				}
//			}
//			left++;
//			right--;
//			top++;
//			bottom--;
//		}
//		return order;
//	}
}
