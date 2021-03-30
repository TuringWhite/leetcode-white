package others2;

import java.util.ArrayList;
import java.util.List;

public class A415 {
	class Solution {
		public String addStrings(String num1, String num2) {
			char[] arr1 = num1.toCharArray();
			char[] arr2 = num2.toCharArray();
			int cur1 = arr1.length - 1;
			int cur2 = arr2.length - 1;
			int carry = 0;
			List<Integer> list = new ArrayList<Integer>();
			int temp = 0;
			while (cur1 >= 0 && cur2 >= 0) {
				temp = arr1[cur1--] - '0' + arr2[cur2--] - '0' + carry;
				list.add(temp % 10);
				carry = temp / 10;
			}
			if (cur1 >= 0) {
				while (cur1 >= 0) {
					temp = arr1[cur1--] - '0' + carry;
					list.add(temp % 10);
					carry = temp / 10;
				}
			} else if (cur2 >= 0) {
				while (cur2 >= 0) {
					temp = arr2[cur2--] - '0' + carry;
					list.add(temp % 10);
					carry = temp / 10;
				}
			}
			if (carry == 1)
				list.add(carry);
			StringBuffer sBuffer = new StringBuffer();
			for (int i = list.size() - 1; i >= 0; i--) {
				sBuffer.append(list.get(i));
			}
			return sBuffer.toString();
		}
	}
}
