package others5;

public class A985 {
	class Solution {
		public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
			int[] result = new int[queries.length];
			int sum = 0;
			for (int num : A)
				if (num % 2 == 0)
					sum += num;
			int pre;
			int index, value;
			int cur = 0;
			for (int i = 0; i < queries.length; i++) {
				index = queries[i][1];
				value = queries[i][0];
				pre = A[index];
				A[index] += value;
				if (pre % 2 == 1 || pre % 2 == -1) {
					if (A[index] % 2 == 0) {
						sum += A[index];
					}
				} else {
					if (A[index] % 2 == 0) {
						sum += value;
					} else {
						sum -= pre;
					}
				}
				result[cur++] = sum;
			}
			return result;
		}
	}
}
