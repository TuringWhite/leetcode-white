package others8;

public class A522 {
	
	//这个算法过不去，题目太烂了，爷不写了欧拉欧拉
	class Solution {
		int max = -1;

		public int findLUSlength(String[] strs) {
			for (int i = 0; i < strs.length; i++) {
				for (int j = 0; j < strs.length; j++) {
					if (i == j) {
						continue;
					} else {
						max = Math.max(max, findLUSlength(strs[i], strs[j]));
					}
				}
			}
			return max;
		}

		public int findLUSlength(String a, String b) {
			if (a.equals(b))
				return -1;
			return a.length() > b.length() ? a.length() : b.length();
		}
	}

}
