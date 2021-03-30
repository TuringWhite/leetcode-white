package others6;

public class A434 {
	class Solution {
		public int countSegments(String s) {
			int ans = 0;
			String[] arr = s.split(" ");
			for (String sub : arr) {
				if (sub.length() > 0)
					ans++;
			}
			return ans;
		}
	}
}
