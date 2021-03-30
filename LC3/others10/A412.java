package others10;

import java.util.ArrayList;
import java.util.List;

public class A412 {
	class Solution {
		public List<String> fizzBuzz(int n) {
			List<String> list = new ArrayList<String>();
			String str1 = "Fizz", str2 = "Buzz", str3 = "FizzBuzz";
			for (int i = 1; i <= n; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					list.add(str3);
				} else if (i % 3 == 0) {
					list.add(str1);
				} else if (i % 5 == 0) {
					list.add(str2);
				} else {
					list.add(i + "");
				}
			}
			return list;
		}
	}
}
