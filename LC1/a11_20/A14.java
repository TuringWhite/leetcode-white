package a11_20;

public class A14 {

	class Solution {
		public String longestCommonPrefix(String[] strs) {
			if (strs.length == 0)
				return "";
			StringBuilder sBuilder = new StringBuilder();
			for (int i = 0; i < strs[0].length(); i++) {
				for (int j = 1; j < strs.length; j++) {
					if (i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i))
						return sBuilder.toString();
				}
				sBuilder.append(strs[0].charAt(i));
			}
			return sBuilder.toString();
		}
	}

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(strs));
		String[] strs2 = { "dog", "racecar", "car" };
		System.out.println(longestCommonPrefix(strs2));
		String[] strs3 = {};
		System.out.println(longestCommonPrefix(strs3));
		String[] strs4 = { "" };
		System.out.println(longestCommonPrefix(strs4));
		String[] strs5 = { "a" };
		System.out.println(longestCommonPrefix(strs5));
		String[] strs6 = { "a", "a" };
		System.out.println(longestCommonPrefix(strs6));
		String[] strs7 = { "aa", "a" };
		System.out.println(longestCommonPrefix(strs7));

	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0];
		}
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() == 0)
				return "";
		}
		int num = 0;
		String c;
		boolean j = true;
		while (j) {
			for (int i = 0; i < strs.length; i++) {
				if (num + 1 > strs[i].length()) {
					return strs[i].substring(0, num);
				}
			}
			c = strs[0].substring(num, num + 1);
//			System.out.println(c);
			for (int i = 1; i < strs.length; i++) {
//				System.out.println(strs[i]+ "-----"+i);
				if ((!strs[i].substring(num, num + 1).equals(c)) || (strs[i].length() < num)) {
					j = false;
					return strs[0].substring(0, num);
				}
			}
			num++;
		}
//		System.out.println(num);
		return strs[0].substring(0, num);
	}
}
