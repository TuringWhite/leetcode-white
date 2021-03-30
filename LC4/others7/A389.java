package others7;

public class A389 {
	class Solution {
		public char findTheDifference(String s, String t) {
			int[] arr1 = new int[26];
			for (int i = 0; i < s.length(); i++) {
				arr1[s.charAt(i) - 'a']++;
				arr1[t.charAt(i) - 'a']--;
			}
			arr1[t.charAt(t.length() - 1) - 'a']--;
			for (int i = 0; i < 26; i++) {
				if (arr1[i] < 0)
					return (char) (i + 'a');
			}
			return '0';
		}
	}
}
