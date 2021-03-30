package a171_180;

public class A171 {
	class Solution {
		public int titleToNumber(String s) {
			char[] arr = s.toCharArray();
			int num = 0;
			for (int i = 0; i < arr.length; i++) {
				num = num * 26 + (arr[i] - 'A' + 1);
			}
			return num;
		}
	}
}
