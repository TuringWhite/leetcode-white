package others7;

import java.util.Arrays;

public class A1370 {

	class Solution {
		public String sortString(String s) {
			char[] help = s.toCharArray();
			Arrays.sort(help);
			StringBuffer sBuffer = new StringBuffer();
			char last = 0;
			int i;
			while (sBuffer.length() < s.length()) {
				for (i = 0; i < help.length; i++) {
					while (i < help.length && (last == help[i] || help[i] == 0)) {
						i++;
					}
					if (i >= help.length) {
						break;
					}
					sBuffer.append(help[i]);
					last = help[i];
					help[i] = 0;
				}
				last = 0;
				for (i = help.length - 1; i >= 0; i--) {
					while (i >= 0 && (last == help[i] || help[i] == 0)) {
						i--;
					}
					if (i < 0) {
						break;
					}
					sBuffer.append(help[i]);
					last = help[i];
					help[i] = 0;
				}
				last = 0;
			}
			return sBuffer.toString();
		}
	}
}
