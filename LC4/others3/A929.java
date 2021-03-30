package others3;

import java.util.HashSet;
import java.util.Set;

public class A929 {
	class Solution {
		public int numUniqueEmails(String[] emails) {
			Set<String> set = new HashSet<>();
			String local, email;
			for (String str : emails) {
				String[] arr = str.split("@");
				local = arr[0];
				if (local.contains("+")) {
					local = local.substring(0, local.indexOf('+'));
				}
				local = local.replace(".", "");
				email = local + "@" + arr[1];
				System.out.println(email);
				if (!set.contains(email))
					set.add(email);
			}
			return set.size();
		}
	}
}
