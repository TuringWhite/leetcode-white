package others4;

import java.util.Arrays;

public class A455 {
	class Solution {
		public int findContentChildren(int[] g, int[] s) {
			boolean flag = true;
			boolean[] sflag = new boolean[s.length];
			int ans = 0;
			int j = 0;
			Arrays.sort(g);
			Arrays.sort(s);
			for (int i = 0; i < g.length; i++) {
				if (!flag)
					break;
				flag = false;
				for (; j < s.length; j++) {
					if (sflag[j] == false && g[i] <= s[j]) {
						sflag[j] = true;
						flag = true;
						ans++;
						break;
					}
				}
			}
			return ans;
		}
	}
}
