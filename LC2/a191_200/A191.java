package a191_200;

public class A191 {
	public class Solution {

		public int hammingWeight(int n) {
			int bits = 0;
			int mask = 1;
			for (int i = 0; i < 32; i++) {
				if ((n & mask) != 0) {
					bits++;
				}
				mask <<= 1;
			}
			return bits;
		}

//		一段有问题的我自己写的位运算代码，-3的例子跑不过去
//		// you need to treat n as an unsigned value
//		public int hammingWeight(int n) {
//			System.out.println(n);
//			int count = 0;
//			while (n > 0) {
//				if ((n & 1) == 1) {
//					count++;
//				}
//				n = n >> 1;
//			}
//
//			return count;
//		}
	}
}
