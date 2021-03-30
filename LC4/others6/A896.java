package others6;

public class A896 {
	class Solution {
		public boolean isMonotonic(int[] A) {
			if (A.length < 2)
				return true;
			int length = A.length;
			int flag = A[length - 1] - A[0];
			if (flag > 0) {
				for (int i = 1; i < length; i++) {
					if (A[i] < A[i - 1])
						return false;
				}
			} else if (flag == 0) {
				for (int i = 1; i < length; i++) {
					if (A[i] != A[i - 1])
						return false;
				}
			} else {
				for (int i = 1; i < length; i++) {
					if (A[i] > A[i - 1])
						return false;
				}
			}
			return true;
		}
	}
}
