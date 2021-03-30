package others10;

public class A264 {

	// 没解决的DP问题，回头再刷
//	class Solution {
//		public int nthUglyNumber(int n) {
//			int[] arr = new int[n + 4];
//
//			arr[0] = 1;
//			arr[1] = 2;
//			arr[2] = 3;
//			arr[3] = 4;
//			arr[4] = 5;
//			if (n <= 5)
//				return arr[n - 1];
//			int i = 0;
//			int a = 4, b = 3, c = 5, min;
//			while (i < n) {
//				min = Math.min(Math.min(a, b), c);
//				if (a == min) {
//					a = a * 2;
//					arr[i++] = a;
//				} else if (b == min) {
//					b = b * 2;
//					arr[i++] = b;
//				} else if (c == min) {
//					c = c * 2;
//					arr[i++] = c;
//				}
//			}
//			return arr[n - 1];
//		}
//	}
}
