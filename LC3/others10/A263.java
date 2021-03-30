package others10;

public class A263 {
	class Solution {
		public boolean isUgly(int num) {
			if (num == 1)
				return true;
			while (num > 1) {
				if (num % 2 == 0) {
					num = num / 2;
				} else if (num % 3 == 0) {
					num = num / 3;
				} else if (num % 5 == 0) {
					num = num / 5;
				} else {
					break;
				}
			}
			return num == 1;
		}
	}
}
