package others10;

public class A326 {
	class Solution {
		public boolean isPowerOfThree(int n) {
			while (n > 1) {
				if (n % 3 == 0)
					n = n / 3;
				else {
					break;
				}
			}
			return n == 1;
		}
	}
}
