package others2;

import java.util.Arrays;

public class A383 {
	class Solution {
		public boolean canConstruct(String ransomNote, String magazine) {
			char[] arr1 = ransomNote.toCharArray();
			char[] arr2 = magazine.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			int cur1 = 0;
			int cur2 = 0;
			while (cur1 < arr1.length && cur2 < arr2.length) {
				if (arr1[cur1] == arr2[cur2])
					cur1++;
				cur2++;
			}
			return cur1 == arr1.length;
		}
	}
}
