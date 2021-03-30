package others3;

public class A859 {
	class Solution {
		public boolean buddyStrings(String A, String B) {
			if (A.length() != B.length())
				return false;
			boolean flag = false;
			for (int i = 0; i < A.length(); i++) {
				if (i != A.lastIndexOf(A.charAt(i))) {
					flag = true;
					break;
				}
			}
			if (A.equals(B) && flag)
				return true;
			if (A.equals(B) && !flag)
				return false;
			int left = -1, right = -1;
			for (int i = 0, j = 0; i < A.length(); i++, j++) {
				if (A.charAt(i) != B.charAt(j) && left == -1) {
					left = i;
				} else if (A.charAt(i) != B.charAt(j) && left != -1) {
					right = i;
					A = A.substring(0, left) + A.charAt(right) + A.substring(left + 1, right) + A.charAt(left)
							+ A.substring(right + 1);
					if (A.equals(B))
						return true;
					else {
						return false;
					}
				}
			}
			System.out.println(A + "       " + B);
			System.out.println(left + "      " + right);
			if (left != -1)
				return false;
			else {
				return true;
			}
		}
	}
}
