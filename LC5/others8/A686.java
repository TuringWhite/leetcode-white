package others8;

public class A686 {
	class Solution {
		public int repeatedStringMatch(String a, String b) {
			StringBuilder sBuilder = new StringBuilder(a);
			int count = 1;
			while (sBuilder.length() <= 2 * a.length() + b.length()) {
				if (sBuilder.indexOf(b) != -1)
					return count;
				sBuilder.append(a);
				count++;
			}
			return -1;
		}
	}
}
