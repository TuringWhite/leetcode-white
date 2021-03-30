package others2;

public class A434 {
	class Solution {
		public int countSegments(String s) {
			String[] arr = s.split(" ");
			int count = 0;
			for (String string : arr) {
				if (string.length() > 0) {
					count++;
				}
			}
			return count;
		}
	}
}
