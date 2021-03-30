package others8;

public class A459 {
	class Solution {
		public boolean repeatedSubstringPattern(String s) {
			int num = 2;
			for (int i = s.length() / num; i > 0; i = s.length() / ++num) {
				String sub = s.substring(0, i);
				int j;
				for (j = 1; j < num; j++) {
					if (!s.substring(i + j * s.length() / num, i + (j + 1) * s.length() / num).equals(sub)) {
						break;
					}
				}
				if (j >= num)
					return true;
			}
			return false;
		}
	}

}
