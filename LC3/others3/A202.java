package others3;

import java.util.HashSet;
import java.util.Set;

public class A202 {
	public boolean isHappy(int n) {
		int num = n;
		Set<Integer> set = new HashSet<Integer>();
		while (num != 1 && !set.contains(num)) {
			set.add(num);
			n = num;
			num = 0;
			while (n > 0) {
				num += (n % 10) * (n % 10);
				n = n / 10;
			}
		}
		return num == 1 ? true : false;
	}
}
