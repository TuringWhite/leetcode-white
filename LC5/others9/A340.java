package others9;

public class A340 {
	class Solution {
		public int lengthOfLongestSubstringKDistinct(String s, int k) {
			int[] map = new int[256];
			int count = 0;
			int left = 0, right = 0;
			while (right < s.length()) {
				if (map[s.charAt(right)] == 0) {
					count++;
				}
				map[s.charAt(right)]++;
				if (count > k) {
					map[s.charAt(left)]--;
					if (map[s.charAt(left)] == 0)
						count--;
					left++;
				}
				right++;
			}
			return s.length() - left;
		}
	}
}
