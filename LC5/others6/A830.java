package others6;

import java.util.ArrayList;
import java.util.List;

public class A830 {
	class Solution {
		public List<List<Integer>> largeGroupPositions(String s) {
			List<List<Integer>> ans = new ArrayList<List<Integer>>();
			int left = 0, right = 0;
			while (right < s.length()-1) {
				right++;
				if (s.charAt(left) != s.charAt(right)) {
					if (right - left >= 3) {
						List<Integer> temp = new ArrayList<>();
						temp.add(left);
						temp.add(right - 1);
						ans.add(temp);
					} 
					left = right;
				}
			}
			right++;
			if (right - left >= 3) {
				List<Integer> temp = new ArrayList<>();
				temp.add(left);
				temp.add(right - 1);
				ans.add(temp);
			} 
			return ans;
		}
	}
}
