package others3;

public class A709 {
	class Solution {

		public String toLowerCase(String str) {
			char[] arr = str.toCharArray();
			int lenght = 'a' - 'A';
			StringBuffer sBuffer = new StringBuffer();
			for (char ch : arr) {
				if ('A' <= ch && ch <= 'Z')
					ch = (char) (ch + lenght);
				sBuffer.append((char) ch);
			}
			return sBuffer.toString();
		}
//		public String toLowerCase(String str) {
//			return str.toLowerCase();
//		}
	}
}
