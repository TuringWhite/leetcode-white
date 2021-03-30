package others9;

public class A921 {
	class Solution {
		public int minAddToMakeValid(String S) {
			int count = 0;
			int ans = 0;
			for (int i = 0; i < S.length(); i++) {
				if (S.charAt(i) == '(') {
					count++;
				} else {
					if (count > 0) {
						count--;
					} else if (count <= 0) {
						ans++;
					}
				}
			}
			if (count > 0)
				ans += count;
			return ans;
		}
	}
}
