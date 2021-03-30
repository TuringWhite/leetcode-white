package others9;

import java.util.HashSet;
import java.util.Set;

public class A771 {
	class Solution {
		public int numJewelsInStones(String jewels, String stones) {
			Set<Character> set = new HashSet<>();
			for (char c : jewels.toCharArray()) {
				set.add(c);
			}
			int ans = 0;
			for(char c : stones.toCharArray())
				if(set.contains(c))
					ans++;
			return ans;
		}
	}
}
