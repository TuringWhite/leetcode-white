package others7;

public class A744 {
	// 题解里的一个二分
	// 这个是我之前看dong哥的笔记提过的，不断缩减空间，而不是直接break
	class Solution {
		public char nextGreatestLetter(char[] letters, char target) {
			int lo = 0, hi = letters.length;
			while (lo < hi) {
				int mi = lo + (hi - lo) / 2;
				if (letters[mi] <= target)
					lo = mi + 1;
				else
					hi = mi;
			}
			return letters[lo % letters.length];
		}
	}

	// 线性扫描所有元素，可以过
//	class Solution {
//		public char nextGreatestLetter(char[] letters, char target) {
//			int cur = 0;
//			while (cur < letters.length) {
//				if (letters[cur] > target) {
//					return letters[cur];
//				}
//				cur++;
//			}
//			return letters[0];
//		}
//	}
	// 一个能过的算法，开了一个额外数组储存存在元素
//	class Solution {
//		public char nextGreatestLetter(char[] letters, char target) {
//			boolean[] flags = new boolean[26];
//			// 记录有哪个字符
//
//			for (int i = 0; i < letters.length; i++) {
//				flags[letters[i] - 'a'] = true;
//			}
//
//			int cur = target - 'a' + 1;
//			while (cur < 26) {
//				if (flags[cur] == true)
//					return (char) ('a' + cur);
//				cur++;
//			}
//			if (cur == 26) {
//				cur = 0;
//				while (cur < 26) {
//					if (flags[cur] == true)
//						return (char) ('a' + cur);
//					cur++;
//				}
//			}
//			return 'a';
//		}
//	}

	// 这是我自己写的二分，如果存在多组相同的字符，有的用例跑不过去，后续实现不了
//	class Solution {
//		public char nextGreatestLetter(char[] letters, char target) {
//			int left = 0, right = letters.length - 1;
//
//			while (left <= right) {
//				int mid = left + (right - left) / 2;
//				if (letters[mid] == target) {
//					left = mid + 1;
//					break;
////					if (mid == letters.length - 1) {
////						return letters[0];
////					} else {
////						return letters[mid + 1];
////					}
//				}
//				if (letters[mid] > target) {
//					right = mid - 1;
//				} else {
//					left = mid + 1;
//				}
//			}
//			while (left < letters.length - 1 && (letters[left] == letters[left + 1] || letters[left] == target)) {
//				left++;
//			}
//			System.out.println(left);
//			if (left == letters.length - 1 && letters[left] == letters[left - 1])
//				return letters[0];
//			if (left == letters.length) {
//				return letters[0];
//			}
//			return letters[left];
//		}
//	}
}
