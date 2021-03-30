package a121_130;

public class A125 {
	class Solution {
		public boolean isPalindrome(String s) {
			s = s.toLowerCase();
			int left = 0, right = s.length() - 1;
			while (left < right) {
				while (left < right && !((s.charAt(left) <= 'z' && s.charAt(left) >= 'a')
						|| s.charAt(left) >= '0' && s.charAt(left) <= '9')) {
					left++;
				}
				while (left < right && !((s.charAt(right) <= 'z' && s.charAt(right) >= 'a')
						|| s.charAt(right) >= '0' && s.charAt(right) <= '9')) {
					right--;
				}
				System.out.println(left + "     " + right);
				if (left >= right)
					break;
				if (s.charAt(left) != s.charAt(right))
					return false;
				left++;
				right--;
			}
			return true;
		}
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
		System.out.println(isPalindrome(""));
		System.out.println(isPalindrome(" "));
	}

	public static boolean isPalindrome(String s) {
		char[] arr = s.toLowerCase().toCharArray();
		StringBuffer sBuffer = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] <= 57 && arr[i] >= 48) || (arr[i] <= 122 && arr[i] >= 97)) {
				sBuffer.append(arr[i]);
			}
		}
		return sBuffer.toString().equals(sBuffer.reverse().toString());
	}
}
