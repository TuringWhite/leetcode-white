package others1;

public class A861 {
	class Solution {
		public int matrixScore(int[][] A) {
			int sum = 0, num;
			// 预处理
			// 修改第一列
			for (int i = 0; i < A.length; i++) {
				if (A[i][0] == 0)
					reversei(A, i);
			}
			// 修改后面的每一列，使得每列的1在一半以上
			for (int j = 1; j < A[0].length; j++) {
				num = 0;
				for (int i = 0; i < A.length; i++) {
					if (A[i][j] == 1) {
						num++;
					}
				}
				//这里的判断，如果写成num<A.length/2是错误的，会丢失余数
				//应该写成num<A.length/2+A.length%2
				if (num * 2 < A.length) {
					reversej(A, j);
				}
			}
			// 求和
			for (int i = 0; i < A.length; i++) {
				num = 0;
				for (int j = 0; j < A[0].length; j++) {
					num = (num << 1) + A[i][j];
				}
				sum = sum + num;
			}
			return sum;
		}

		// 反转第i行
		public void reversei(int[][] A, int i) {
			for (int j = 0; j < A[0].length; j++) {
				A[i][j] = A[i][j] == 0 ? 1 : 0;
			}
		}

		// 反转第i列
		public void reversej(int[][] A, int i) {
			for (int j = 0; j < A.length; j++) {
				A[j][i] = A[j][i] == 0 ? 1 : 0;
			}
		}

		public void printsecond(int[][] A) {
			for (int i = 0; i < A.length; i++) {
				for (int j = 0; j < A[0].length; j++) {
					System.out.print(A[i][j] + "  ");
				}
				System.out.println();
			}

		}
	}
}
