package others9;

public class A1004 {
	class Solution {
		public int longestOnes(int[] A, int K) {
			int zero = 0;
			int left = 0, right = 0;
			while (right < A.length) {
				if (A[right] == 0)
					zero++;
				if (zero > K) {
					if (A[left] == 0)
						zero--;
					left++;
				}
				right++;
			}
			return A.length - left;
		}
	}
}
