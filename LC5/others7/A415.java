package others7;

import java.util.ArrayList;
import java.util.List;

public class A415 {
	class Solution {
		public List<String> fizzBuzz(int n) {
			List<String> list = new ArrayList<String>();
			for (int i = 1; i <= n; i++) {
				if (i % 3 == 0) {
					if (i % 5 == 0)
						list.add("FizzBuzz");
					else
						list.add("Fizz");
				} else if (i % 5 == 0) {
					list.add("Buzz");
				} else {
					list.add(i + "");
				}
			}
			return list;
		}
	}
}
