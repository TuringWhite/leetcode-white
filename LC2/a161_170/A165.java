package a161_170;

public class A165 {
	class Solution {
		public int compareVersion(String version1, String version2) {
			String[] arr1 = version1.split("\\.");
			String[] arr2 = version2.split("\\.");
			System.out.println(arr1.length + "   " + arr2.length);
			for (int i = 0; i < arr1.length && i < arr2.length; i++) {
				int temp1 = Integer.valueOf(arr1[i]);
				int temp2 = Integer.valueOf(arr2[i]);
				System.out.println(temp1 + "     " + temp2);
				if (temp1 > temp2)
					return 1;
				if (temp1 < temp2)
					return -1;
			}
			// 剩余的按照0来做判断
			if (arr1.length < arr2.length) {
				for (int i = arr1.length; i < arr2.length; i++) {
					int temp = Integer.valueOf(arr2[i]);
					if (temp > 0)
						return -1;
					if (temp < 0)
						return 1;
				}
			} else if (arr1.length > arr2.length) {
				for (int i = arr2.length; i < arr1.length; i++) {
					int temp = Integer.valueOf(arr1[i]);
					if (temp > 0)
						return 1;
					if (temp < 0)
						return -1;
				}
			}
			return 0;
		}
	}
}
