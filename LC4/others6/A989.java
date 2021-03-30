package others6;

import java.util.ArrayList;
import java.util.List;

public class A989 {
	class Solution {
		public List<Integer> addToArrayForm(int[] A, int K) {
			List<Integer> list = new ArrayList<Integer>();
			int carry = 0;
			int length = A.length;
			int i;
			for (i = length - 1; i >= 0; i--) {
				int sum = A[i] + K % 10 + carry;
				carry = sum / 10;
				list.add(0, sum % 10);
				K = K / 10;
			}
			while (K != 0) {
				int sum = K % 10 + carry;
				carry = sum / 10;
				list.add(0, sum % 10);
				K = K / 10;
			}
			if (carry == 1)
				list.add(0, 1);
			return list;
		}
	}
}
