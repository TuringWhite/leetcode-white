package others7;

public class A367 {
	class Solution {
		public boolean isPerfectSquare(int num) {
			int left = 0, right = num;
			int mid = left + (right - left) / 2;
			while (left <= right) {
				if ((long) mid * mid == num) {
					return true;
				}
				if ((long) mid * mid < num) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
				mid = left + (right - left) / 2;
			}
			return false;
		}
	}
}
