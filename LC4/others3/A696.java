package others3;

public class A696 {
	class Solution {
		public int countBinarySubstrings(String s) {
			int last = 0, now = 0, count = 0;
			int cur = s.charAt(0);
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == cur) {
					now++;
				} else {
					count = count + (now < last ? now : last);
					last = now;
					now = 1;
					cur = s.charAt(i);
				}
			}
			// 这里三元运算符，需要加括号，就离谱。。。可能是我javase太烂了
			count = count + (now < last ? now : last);
			return count;
		}
	}
}

//思路有问题的一个算法:(
//class Solution {
//	public int countBinarySubstrings(String s) {
//		int one = 0, zero = 0;
//		int left = 0, right = 0;
//		int count = 0;
//		while (left < s.length()) {
//			if (s.charAt(right) == '1') {
//				one++;
//			} else {
//				zero++;
//			}
//			if (one > 0 && zero > 0 && s.charAt(left) == s.charAt(right)) {
//				while (one > 0 && zero > 0 && s.charAt(left) == s.charAt(right)) {
//					if (one == zero)
//						count++;
//					if (s.charAt(left) == '1') {
//						one--;
//					} else {
//						zero--;
//					}
//					left++;
//
//				}
//			}
//			if (one == zero)
//				count++;
//			right++;
//
//			if (right == s.length()) {
//				while (left < s.length()) {
//					if (s.charAt(left) == '1') {
//						one--;
//					} else {
//						zero--;
//					}
//					if (one == zero)
//						count++;
//					left++;
//				}
//			}
//		}
//		return count;
//	}
//}