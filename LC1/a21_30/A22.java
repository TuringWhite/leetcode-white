package a21_30;

import java.util.ArrayList;
import java.util.List;

public class A22 {

	class Solution {
		int n;
		List<String> result = new ArrayList<>();

		public List<String> generateParenthesis(int n) {
			this.n = n;
			help("", 0, 0);
			return result;
		}

		public void help(String str, int left, int right) {
			if (left < right || left > n || right > n)
				return;
			if (left == n && right == n) {
				result.add(str);
				return;
			}
			help(str + "(", left + 1, right);
			help(str + ")", left, right + 1);
		}
	}
//	class Solution {
//		public List<String> generateParenthesis(int n) {
//			List<String> ans = new ArrayList<String>();
//			backtrack(ans, new StringBuilder(), 0, 0, n);
//			return ans;
//		}
//
//		public void backtrack(List<String> ans, StringBuilder cur, int open, int close, int max) {
//			if (cur.length() == max * 2) {
//				ans.add(cur.toString());
//				return;
//			}
//			if (open < max) {
//				cur.append('(');
//				backtrack(ans, cur, open + 1, close, max);
//				cur.deleteCharAt(cur.length() - 1);
//			}
//			if (close < open) {
//				cur.append(')');
//				backtrack(ans, cur, open, close + 1, max);
//				cur.deleteCharAt(cur.length() - 1);
//			}
//		}
//	}

}
