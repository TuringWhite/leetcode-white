package others8;

public class A415 {
	class Solution {
		public String addStrings(String num1, String num2) {
			StringBuilder sBuilder = new StringBuilder();
			int carry = 0;
			for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--) {
				int sum = carry;
				sum += i >= 0 ? num1.charAt(i) - '0' : 0;
				sum += j >= 0 ? num2.charAt(j) - '0' : 0;
				sBuilder.append(sum % 10);
				carry = sum / 10;
			}
			sBuilder.append(carry == 1 ? carry : "");
			return sBuilder.reverse().toString();
		}
	}
}
