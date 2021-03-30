package others8;

public class A392 {
	class Solution {
		public boolean isSubsequence(String s, String t) {
			if (s.length() > t.length())
				return false;
			if (s.length() == 0)
				return true;
			char[] sarr = s.toCharArray();
			char[] tarr = t.toCharArray();
			int curt = 0;
			int curs = 0;
			while (curt < t.length()) {
				if (sarr[curs] == tarr[curt]) {
					curs++;
					if (curs == s.length())
						return true;
				}
				curt++;
			}
			return false;
		}
	}
}
