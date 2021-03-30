package a1_10;

import java.util.HashSet;
import java.util.Set;

public class A3 {

	class Solution {
		public int lengthOfLongestSubstring(String s) {
			int left = 0, right = 0;
			char[] arr = s.toCharArray();
			Set<Character> set = new HashSet<>();
			int length = 0;
			while (right < arr.length) {
				if (set.contains(arr[right])) {
					while (set.contains(arr[right])) {
						set.remove(arr[left++]);
					}
					set.add(arr[right++]);
					length = length > right - left ? length : right - left;
				} else {
					set.add(arr[right++]);
					length = length > right - left ? length : right - left;
				}
			}
			return length;
		}
	}
//	public static void main(String[] args) {
//		System.out.println(lengthOfLongestSubstring("abcabcbb"));
//		System.out.println(lengthOfLongestSubstring("bbbbb"));
//		System.out.println(lengthOfLongestSubstring("pwwkew"));
//		System.out.println(lengthOfLongestSubstring(""));
//		System.out.println(lengthOfLongestSubstring(" "));
//		System.out.println(lengthOfLongestSubstring(" 1"));
//	}
//
//	public static int lengthOfLongestSubstring(String s) {
//		int maxLength = 0;
//		char[] arr = s.toCharArray();
//		Map<Character, Integer> map = new HashMap<>();
//		for (int i = 0; i < arr.length; i++) {
//			if (!map.containsKey(arr[i])) {
//				map.put(arr[i], 1);
//			} else {
//				maxLength = maxLength > map.size() ? maxLength : map.size();
//				i = i - map.size();
//				map.clear();
//			}
//		}
//		maxLength = maxLength > map.size() ? maxLength : map.size();
//		return maxLength;
//	}
}
