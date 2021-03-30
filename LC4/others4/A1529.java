package others4;

public class A1529 {
	class Solution {
		public int minFlips(String target) {
			if (!target.contains("1"))
				return 0;
			int count = 0;
			int length = target.length();
			for (int i = target.indexOf("1"); i < length; i++) {
				if (target.charAt(i) == '0') {
					count++;
					i++;
					while (i < length && target.charAt(i) == '0')
						i++;
					i--;
				}
			}
			return 1 + (target.charAt(target.length() - 1) == '0' ? -1 : 0) + 2 * count;
		}
	}
}
