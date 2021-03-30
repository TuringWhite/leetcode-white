package a21_30;

public class A28 {

	class Solution {
		public int strStr(String haystack, String needle) {
			if (haystack.length() == 0 && needle.length() != 0)
				return -1;
			if (haystack.length() == 0 || needle.length() == 0)
				return 0;
			if (haystack.length() < needle.length())
				return -1;
			int i = 0, j = 0;
			while (i + needle.length() < haystack.length()) {
				while (j < needle.length() && haystack.charAt(i) == needle.charAt(j)) {
					i++;
					j++;
				}
				if (j == needle.length())
					return i - j;
				i -= j;
				j = 0;
				i++;
			}

			return -1;
		}
	}

	public static void main(String[] args) {
		System.out.println(strStr("hello", "ll"));
		System.out.println(strStr("aaaaa", "bba"));
		System.out.println(strStr("aaaaa", "aaaaa"));
		System.out.println(strStr("", ""));
	}

	public static int strStr(String haystack, String needle) {
		if (haystack.length() == 0 && needle.length() == 0) {
			return 0;
		}
		if (needle.length() == 0)
			return 0;
		if (needle.length() > haystack.length()) {
			return -1;
		}
		char[] ch1 = haystack.toCharArray();
		char[] ch2 = needle.toCharArray();
		int i, j;
		for (i = 0; i < ch1.length && ch1.length - i >= ch2.length; i++) {
			for (j = 0; j < ch2.length; j++, i++) {
				if (ch2[j] != ch1[i]) {
					i = i - j;
					break;
				}
			}
			if (j == ch2.length) {
				return i - j;
			}
		}
		return -1;
	}
}
