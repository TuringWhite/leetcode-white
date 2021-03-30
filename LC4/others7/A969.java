package others7;

import java.util.ArrayList;
import java.util.List;

public class A969 {
	class Solution {
		public List<Integer> pancakeSort(int[] arr) {
			List<Integer> ans = new ArrayList<Integer>();
			int max = arr.length, cur = -1;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length - i; j++) {
					if (arr[j] == max) {
						max--;
						cur = j + 1;
						break;
					}
				}
				if (cur != arr.length - i) {
					if (cur != 1) {
						//反转[1,cur]
						ans.add(cur);
					}
					//反转[1,arr.length - i]
					ans.add(arr.length - i);
				}
			}
			return ans;
		}
	}
}
