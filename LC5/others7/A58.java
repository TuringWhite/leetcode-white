package others7;

public class A58 {
	class Solution {
		public int lengthOfLastWord(String s) {
			s = s.trim();
			if (s.length() == 0)
				return 0;
			int ans = 0;
			for (int i = s.length() - 1; i >= 0; i--) {
				if (s.charAt(i) == ' ')
					break;
				ans++;
			}
			return ans;
		}
	}

}
