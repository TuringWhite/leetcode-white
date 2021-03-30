package a61_70;

public class A67 {
	public static void main(String[] args) {
		System.out.println(addBinary("11", "1"));
		System.out.println(addBinary("11", "0"));

		System.out.println(addBinary("1010", "1011"));
		System.out.println(addBinary("11111", "1"));
		System.out.println(addBinary("1", "11111"));
		System.out.println(addBinary("1", "1"));
		System.out.println(addBinary("1", "0"));

	}

	class Solution {
		public String addBinary(String a, String b) {
			StringBuilder ans = new StringBuilder();
			int ca = 0;
			for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
				int sum = ca;
				sum += i >= 0 ? a.charAt(i) - '0' : 0;
				sum += j >= 0 ? b.charAt(j) - '0' : 0;
				ans.append(sum % 2);
				ca = sum / 2;
			}
			ans.append(ca == 1 ? ca : "");
			return ans.reverse().toString();
		}
	}

	public static String addBinary(String a, String b) {
		char[] as = a.toCharArray();
		char[] bs = b.toCharArray();
		StringBuffer sBuffer = new StringBuffer();
		int i = as.length - 1;
		int j = bs.length - 1;
		int sum = 0;
		int carry = 0;
		for (; i >= 0 && j >= 0; i--, j--) {
			sum = carry + as[i] + bs[j] - 96;
			if (sum == 3) {
				sBuffer.append("1");
				carry = 1;
			} else if (sum == 2) {
				sBuffer.append("0");
				carry = 1;
			} else {
				sBuffer.append(sum);
				carry = 0;
			}
		}
		if (i >= 0) {
			for (; i >= 0; i--) {
				sum = carry + as[i] - 48;
				if (sum == 2) {
					sBuffer.append("0");
					carry = 1;
				} else {
					sBuffer.append(sum);
					carry = 0;
				}
			}
		}
		if (j >= 0) {
			for (; j >= 0; j--) {
				sum = carry + bs[j] - 48;
				if (sum == 2) {
					sBuffer.append("0");
					carry = 1;
				} else {
					sBuffer.append(sum);
					carry = 0;
				}
			}
		}
		if (carry == 1) {
			sBuffer.append("1");
		}
		return sBuffer.reverse().toString();
	}
}
