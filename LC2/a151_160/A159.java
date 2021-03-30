package a151_160;

import java.util.Collections;
import java.util.HashMap;

public class A159 {
	class Solution {
		public int lengthOfLongestSubstringTwoDistinct(String s) {
			int[] map = new int[256];
			int count = 0;
			int left = 0, right = 0;
			while (right < s.length()) {
				if (map[s.charAt(right)] == 0) {
					count++;
				}
				map[s.charAt(right)]++;
				if (count > 2) {
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

//优雅
class Solution {
	public int lengthOfLongestSubstringTwoDistinct(String s) {
		int n = s.length();
		if (n < 3)
			return n;

		// sliding window left and right pointers
		int left = 0;
		int right = 0;
		// hashmap character -> its rightmost position
		// in the sliding window
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

		int max_len = 2;

		while (right < n) {
			// slidewindow contains less than 3 characters
			if (hashmap.size() < 3)
				hashmap.put(s.charAt(right), right++);

			// slidewindow contains 3 characters
			if (hashmap.size() == 3) {
				// delete the leftmost character
				int del_idx = Collections.min(hashmap.values());
				hashmap.remove(s.charAt(del_idx));
				// move left pointer of the slidewindow
				left = del_idx + 1;
			}

			max_len = Math.max(max_len, right - left);
		}
		return max_len;
	}
}
