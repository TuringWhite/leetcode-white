package others9;

public class A365 {

	class Solution {
		public boolean canMeasureWater(int x, int y, int z) {
			if (x + y < z) {
				return false;
			}
			if (x == 0 || y == 0) {
				return z == 0 || x + y == z;
			}
			return z % gcd(x, y) == 0;
		}

		public int gcd(int x, int y) {
			int remainder = x % y;
			while (remainder != 0) {
				x = y;
				y = remainder;
				remainder = x % y;
			}
			return y;
		}
	}

}

class Solution {
	public boolean canMeasureWater(int x, int y, int z) {
		if (x + y < z) {
			return false;
		}
		if (x == 0 || y == 0) {
			if (x == z || y == z) {
				return true;
			} else {
				return false;
			}
		}
		return z % gcd(x, y) == 0;
	}

	public int gcd(int x, int y) {
		int remainder = x % y;
		while (remainder != 0) {
			x = y;
			y = remainder;
			remainder = x % y;
		}
		return y;
	}
}