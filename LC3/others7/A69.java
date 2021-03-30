package others7;

public class A69 {
	class Solution {
		public int mySqrt(int x) {
			long left = 0, right = x;
			long mid = left + (right - left) / 2;
			while (left <= right) {
				if (mid * mid == x)
					return (int) mid;
				if (mid * mid < x) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
				mid = left + (right - left) / 2;
			}
			return (int) Math.min(left, right);
		}
	}
}
