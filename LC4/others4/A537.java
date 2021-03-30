package others4;

public class A537 {
	class Solution {
		public String complexNumberMultiply(String a, String b) {
			String x1 = "", x2 = "", y1 = "", y2 = "";
			int i = 0;
			for (; i < a.length(); ++i) {
				if (a.charAt(i) != '+')
					x1 = x1 + a.charAt(i);
				else {
					break;
				}
			}
			for (++i; i < a.length() - 1; ++i) {
				x2 = x2 + a.charAt(i);
			}
			i = 0;
			for (; i < b.length(); ++i) {
				if (b.charAt(i) != '+')
					y1 = y1 + b.charAt(i);
				else {
					break;
				}
			}
			for (++i; i < b.length() - 1; ++i) {
				y2 = y2 + b.charAt(i);
			}
			System.out.println(x1 + "    " + x2 + "    " + y1 + "      " + y2);
			int m1 = Integer.valueOf(x1), m2 = Integer.valueOf(x2), n1 = Integer.valueOf(y1), n2 = Integer.valueOf(y2);

			return (m1 * n1 - m2 * n2) + "+" + (m1 * n2 + m2 * n1) + "i";
		}
	}
}
