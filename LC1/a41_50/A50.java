package a41_50;

public class A50 {
	class Solution {

		public double myPow(double x, int n) {
			double res = 1.0;
			for (int i = n; i > 0; i = i / 2) {
				if (i % 2 != 0) {
					res *= x;
				}
				x *= x;
			}
			return n < 0 ? 1 / res : res;
		}

	}

//	一个我写的有瑕疵的方法
//		public double myPow(double x, int n) {
//			int temp = Math.abs(n);
//			if (n == 0)
//				return 1;
//			double product = 1;
//			while (temp > 1) {
//				if (temp % 2 == 1) {
//					product = product * x;
//				}
//				product = product * product;
//				temp = temp / 2;
//			}
//			if (n < 0) {
//				return 1 / product;
//			}
//			return product;
//		}
//	}

	public double myPow(double x, int n) {
		double res = 1.0;
		for (int i = n; i != 0; i /= 2) {
			if (i % 2 != 0) {
				res *= x;
			}
			x *= x;
		}
		return n < 0 ? 1 / res : res;
	}
}
