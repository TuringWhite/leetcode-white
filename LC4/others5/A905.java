package others5;

public class A905 {
	class Solution {
		public int[] sortArrayByParity(int[] A) {
			int right = A.length;
			int temp;
			for (int i = 0; i < right; i++) {
				if (A[i] % 2 == 1) {
					temp = A[right - 1];
					A[right - 1] = A[i];
					A[i] = temp;
					right--;
					i--;
				}
			}
			return A;
		}
	}
}
