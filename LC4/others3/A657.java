package others3;

public class A657 {
	class Solution {
		public boolean judgeCircle(String moves) {
			int x = 0, y = 0;
			for (int i = 0; i < moves.length(); ++i) {
				switch (moves.charAt(i)) {
				case 'L':
					++x;
					break;
				case 'R':
					--x;
					break;
				case 'U':
					++y;
					break;
				case 'D':
					--y;
					break;
				default:
					return false;
				}
			}
			return x == 0 && y == 0;
		}
	}
}
