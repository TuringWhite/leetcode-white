package others7;

public class A278 {
	public class Solution {
		public int firstBadVersion(int n) {
			int left = 1, right = n;
			int mid = left + (right - left) / 2;
			while (left < right) {
				if (isBadVersion(mid) == true) {
					right = mid;
				} else {
					left = mid + 1;
				}
				mid = left + (right - left) / 2;
			}
			return left;
		}

		boolean isBadVersion(int version) {
			return true;
		}
	}
}
