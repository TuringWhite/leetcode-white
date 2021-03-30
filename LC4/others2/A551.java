package others2;

public class A551 {
	class Solution {
		public boolean checkRecord(String s) {
			if (s.contains("LLL"))
				return false;
			if (s.lastIndexOf("A") != s.indexOf("A"))
				return false;
			return true;
		}
	}
}
