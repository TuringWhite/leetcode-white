package others3;

public class A860 {
	class Solution {
		public boolean lemonadeChange(int[] bills) {
			int five = 0, ten = 0;
			for (int num : bills) {
				switch (num) {
				case 5:
					five++;
					break;
				case 10:
					if (five <= 0)
						return false;
					five--;
					ten++;
					break;
				case 20:
					if ((five <= 2 && ten <= 0) || (five <= 0))
						return false;
					else if (ten <= 0 && five >= 3) {
						five = five - 3;
					} else {
						five--;
						ten--;
					}
					break;
				}
			}
			return true;
		}
	}
}
