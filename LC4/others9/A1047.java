package others9;

public class A1047 {
	class Solution {
		public String removeDuplicates(String S) {
			char[] arr = new char[S.length()];
			int cur = -1;
			for (char ch : S.toCharArray()) {
				if (cur >= 0 && arr[cur] == ch) {
					cur--;
				} else {
					arr[++cur] = ch;
				}
			}
			StringBuilder sBuilder = new StringBuilder();
			for (int i = 0; i <= cur; i++) {
				sBuilder.append(arr[i]);
			}
			return sBuilder.toString();
		}
	}
}
