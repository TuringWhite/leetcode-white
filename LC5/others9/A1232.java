package others9;

public class A1232 {
	class Solution {
		public boolean checkStraightLine(int[][] coordinates) {
			int x0 = coordinates[0][0];
			int y0 = coordinates[0][1];
			if (x0 == coordinates[1][0]) {
				for (int i = 2; i < coordinates.length; i++) {
					if (x0 != coordinates[i][0])
						return false;
				}
				return true;
			} else {
				float k = (float)(coordinates[0][1] - coordinates[1][1]) / (coordinates[0][0] - coordinates[1][0]);
				System.out.println(k);
				for (int i = 2; i < coordinates.length; i++) {
					if ((float) (y0 - coordinates[i][1]) / (x0 - coordinates[i][0]) != k)
						return false;
				}
				return true;
			}
		}
	}
}
