package others9;

public class A424 {

	class Solution {
		int[] map = new int[26];

		public int characterReplacement(String s, int k) {
			if (s == null || s.length() == 0)
				return 0;
			int left = 0, right = 0, max = 0;
			while (right < s.length()) {
				int index = s.charAt(right) - 'A';
				map[index]++;
				max = Math.max(max, map[index]);
				if (right - left + 1 > max + k) {
					map[s.charAt(left) - 'A']--;
					left++;
				}
				right++;
			}
			return s.length() - left;
		}
	}
}

class Solution1 {
	private int[] map = new int[26];

	public int characterReplacement(String s, int k) {
		if (s == null) {
			return 0;
		}
		char[] chars = s.toCharArray();
		int left = 0;
		int right = 0;
		int historyCharMax = 0;
		for (right = 0; right < chars.length; right++) {
			int index = chars[right] - 'A';
			map[index]++;
			historyCharMax = Math.max(historyCharMax, map[index]);
			if (right - left + 1 > historyCharMax + k) {
				map[chars[left] - 'A']--;
				left++;
			}
		}
		return chars.length - left;
	}
}
