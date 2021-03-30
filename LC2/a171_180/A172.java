package a171_180;

public class A172 {
	class Solution {
		public int trailingZeroes(int n) {
			int count = 0;
			while (n >= 5) {
				count += n / 5;
				n /= 5;
			}
			return count;
		}
	}
}
