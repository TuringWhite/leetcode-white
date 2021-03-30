package others5;

public class A832 {
	class Solution {
		public int[][] flipAndInvertImage(int[][] A) {
			for (int i = 0; i < A.length; i++) {
				int left = 0, right = A[0].length - 1;
				int temp;
				while (left < right) {
					temp = A[i][left];
					if (A[i][right] == 0) {
						A[i][left] = 1;
					} else {
						A[i][left] = 0;
					}
					if (temp == 0) {
						A[i][right] = 1;
					} else {
						A[i][right] = 0;
					}
					left++;
					right--;
				}
				if (left == right) {
					if (A[i][left] == 0) {
						A[i][left] = 1;
					} else {
						A[i][left] = 0;
					}
				}
			}
			return A;
		}
	}
}
