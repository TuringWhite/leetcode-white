package a31_40;

public class A38 {
	class Solution {
		public String countAndSay(int n) {
			if (n == 1)
				return "1";
			if (n == 2)
				return "11";
			StringBuilder pre;
			StringBuilder cur = new StringBuilder();
			cur.append("11");

			for (int i = 3; i <= n; i++) {
				pre = cur;
				cur = new StringBuilder();
				int count = 0;
				for (int j = 0; j < pre.length() - 1; j++) {
					if (pre.charAt(j) == pre.charAt(j + 1))
						count++;
					else {
						cur.append(count+1);
						cur.append(pre.charAt(j));
						count = 0;
					}
				}
				System.out.println(pre.toString() + "    " + cur.toString());
				if (pre.charAt(pre.length() - 1) == pre.charAt(pre.length() - 2)) {
					cur.append(count + 1);
					cur.append(pre.charAt(pre.length() - 1));
				} else {
					cur.append(1);
					cur.append(pre.charAt(pre.length() - 1));
				}
			}
			return cur.toString();
		}
	}

	public static void main(String[] args) {
		System.out.println(countAndSay(1));
		System.out.println(countAndSay(2));
		System.out.println(countAndSay(3));
		System.out.println(countAndSay(4));

		System.out.println(countAndSay(5));
		System.out.println(countAndSay(6));
		System.out.println(countAndSay(7));
		System.out.println(countAndSay(8));
		System.out.println(countAndSay(9));
		System.out.println(countAndSay(10));

	}

	public static String countAndSay(int n) {
		int row = 1;
		char[] ch;
		StringBuilder sBuilder = new StringBuilder("1");
		int count = 0;
		for (row = 1; row < n; row++) {
			ch = sBuilder.toString().toCharArray();
			sBuilder = new StringBuilder();
			for (int i = 0; i < ch.length; i++) {
				count++;
				if (i == ch.length - 1) {
					sBuilder.append(count);
					sBuilder.append(ch[i]);
					count = 0;
					break;
				}
				if (ch[i] != ch[i + 1]) {
					sBuilder.append(count);
					sBuilder.append(ch[i]);
					count = 0;
				}
			}
		}
		return sBuilder.toString();
	}
}
