package others2;

public class A521 {
	class Solution {
		public int findLUSlength(String a, String b) {
			int max = -1;
			for (int i = 0; i < a.length(); i++)
				for (int j = i + 1; j < a.length() + 1; j++)
					if (!b.contains(a.substring(i, j)))
						max = max > j - i ? max : j - i;
			for (int i = 0; i < b.length(); i++)
				for (int j = i + 1; j < b.length() + 1; j++)
					if (!a.contains(b.substring(i, j)))
						max = max > j - i ? max : j - i;
			return max;
		}
	}
}
