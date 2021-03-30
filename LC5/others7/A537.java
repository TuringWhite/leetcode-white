package others7;

public class A537 {
	class Solution {
		public String complexNumberMultiply(String a, String b) {
			int a1, a2, b1, b2;
			String[] aStrings = a.split("\\+");
			String[] bStrings = b.split("\\+");
			a1 = Integer.valueOf(aStrings[0]);
			a2 = Integer.valueOf(aStrings[1].substring(0, aStrings[1].length() - 1));
			b1 = Integer.valueOf(bStrings[0]);
			b2 = Integer.valueOf(bStrings[1].substring(0, bStrings[1].length() - 1));
			return (a1 * b1 - a2 * b2) + "+" + (a1 * b2 + a2 * b1) + "i";
		}
	}
}
