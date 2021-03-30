package others8;

public class A2799 {

	// DP ,我想的简单了，溜了溜了
//	class Solution {
//		public int numSquares(int n) {
//			int i = 1;
//			int count = 0;
//			List<Integer> list = new ArrayList<Integer>();
//			list.add(0);
//			while (i * i <= n) {
//				list.add(i * i);
//				++i;
//			}
//			i--;
//			while (n > 0 && i > 0) {
//				if (list.get(i) == n) {
//					++count;
//					return count;
//				}
//				if (list.get(i) < n) {
//					n -= list.get(i);
//					count++;
//				} else {
//					i--;
//				}
//			}
//			return count;
//		}
//	}
}
