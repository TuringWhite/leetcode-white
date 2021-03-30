package others4;

import java.util.Arrays;

public class A1433 {
	class Solution {
		public boolean checkIfCanBreak(String s1, String s2) {
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			boolean flag1 = true, flag2 = true;
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] > arr2[i]) {
					flag1 = false;
					break;
				}
			}
			if (flag1)
				return flag1;
			for (int i = 0; i < arr2.length; i++) {
				if (arr2[i] > arr1[i]) {
					flag2 = false;
					break;
				}
			}
			return flag2;
		}
	}
}
