package others4;

public class A647 {
	class Solution {
		public int countSubstrings(String s) {
			StringBuffer sBuffer;
			int result = 0;
			for (int i = 0; i < s.length(); i++) {
				sBuffer = new StringBuffer();
				for (int j = i; j < s.length(); j++) {
					sBuffer.append(s.charAt(j));
					if (sBuffer.toString().equals(sBuffer.reverse().toString()))
						result++;
					sBuffer.reverse();
				}
			}
			return result;
		}
	}
}
