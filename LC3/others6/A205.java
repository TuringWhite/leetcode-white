package others6;

public class A205 {
	class Solution {
		public boolean help(String s, String t) {
			if (s.length() != t.length())
				return false;
			char[] arr1 = s.toCharArray();
			char[] arr2 = t.toCharArray();
			boolean[] flag2 = new boolean[t.length()];
			for (int i = 0; i < arr1.length; i++) {
				if (flag2[i] == false) {
					char temp = arr2[i];
					char replacement = arr1[i];
					for (int j = i; j < arr2.length; j++) {
						if (flag2[j] == false && arr2[j] == temp) {
							arr2[j] = replacement;
							flag2[j] = true;
						}
					}
				}
			}
			return String.copyValueOf(arr1).equals(String.copyValueOf(arr2));
		}

		public boolean isIsomorphic(String s, String t) {
			return help(s, t) && help(t, s);
		}
	}
}
