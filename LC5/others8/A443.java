package others8;

public class A443 {
	class Solution {
		public int compress(char[] chars) {
			int cur = 0;
			int alter = 0;
			int count = 0;

			for (int i = 0; i < chars.length; i++) {
//				System.out.println(i + "   " + cur);
				if (chars[cur] == chars[i])
					count++;
				else {
					if (count == 1)
						chars[alter++] = chars[cur];
					else if (count >= 2) {
						chars[alter++] = chars[cur];
						String temp = "" + count;
						for (int j = 0; j < temp.length(); j++) {
							chars[alter++] = temp.charAt(j);
						}
					}
					count = 1;
					cur = i;
				}
			}
			if (count == 1)
				chars[alter++] = chars[cur];
			else if (count >= 2) {
				chars[alter++] = chars[cur];
				String temp = "" + count;
				for (int j = 0; j < temp.length(); j++) {
					chars[alter++] = temp.charAt(j);
				}
			}
			return alter;
		}
	}
}

class Solutio1 {
	public int compress(char[] chars) {
		int anchor = 0, write = 0;
		for (int read = 0; read < chars.length; read++) {
			if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
				chars[write++] = chars[anchor];
				if (read > anchor) {
					for (char c : ("" + (read - anchor + 1)).toCharArray()) {
						chars[write++] = c;
					}
				}
				anchor = read + 1;
			}
		}
		return write;
	}
}
