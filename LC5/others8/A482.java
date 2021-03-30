package others8;

public class A482 {
	class Solution {
		public String licenseKeyFormatting(String S, int K) {
			StringBuilder sbBuilder = new StringBuilder(S.replaceAll("-", "").toUpperCase());
			int cur = sbBuilder.length() % K;
			if(cur == 0)
				cur+=K;
			while (cur < sbBuilder.length()) {
				sbBuilder.insert(cur, "-");
				cur = cur + K + 1;
			}
			return sbBuilder.toString();
		}
	}
}
