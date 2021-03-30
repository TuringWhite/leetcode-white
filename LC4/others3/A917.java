package others3;

public class A917 {
	class Solution {
		public String reverseOnlyLetters(String S) {
			char[] help = S.toCharArray();
			int left = 0, right = help.length - 1;
			char temp;
			while (left < right) {
				while (left < right && !isAZ(help[left])) {
					left++;
				}
				while (left < right && !isAZ(help[right])) {
					right--;
				}
				if (left >= right) {
					break;
				}
				temp = help[left];
				help[left] = help[right];
				help[right] = temp;
				left++;
				right--;
			}
			StringBuffer sBuffer = new StringBuffer();
			sBuffer.append(help);
			return sBuffer.toString();
		}

		public boolean isAZ(char ch) {
			return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
		}
	}
}
