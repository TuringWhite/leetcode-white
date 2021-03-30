package others2;

public class A925 {
	public boolean isLongPressedName(String name, String typed) {
		char[] arr1 = name.toCharArray();
		char[] arr2 = typed.toCharArray();
		int i = 0, j = 0;
		int count1 = 0, count2 = 0;
		while (i < arr1.length && j < arr2.length) {
			count1 = count2 = 0;
			if (arr1[i] == arr2[j]) {
				count1++;
				count2++;
				while (j < arr2.length && arr1[i] == arr2[j]) {
					j++;
					count2++;
				}
				do {
					i++;
					count1++;
				} while (i < arr1.length && arr1[i] == arr1[i - 1]);
				if (count1 > count2)
					return false;
				continue;
			} else {
				return false;
			}
		}
		if (i == arr1.length && j == arr2.length) {
			return true;
		} else {
			return false;
		}
	}
}
