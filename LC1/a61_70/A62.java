package a61_70;

import java.math.BigInteger;

public class A62 {

	class Solution {
		public int uniquePaths(int m, int n) {
			int b = Math.min(m, n) - 1;
			if (b == 0)
				return 1;
			int a = m + n - 2;
			BigInteger num = new BigInteger("1");
			BigInteger divisor = new BigInteger("1");
			for (int i = 0; i < b; i++) {
				num = num.multiply(new BigInteger(a + ""));
				a--;
			}
			for (int i = 1; i <= b; i++) {
				divisor = divisor.multiply(new BigInteger(i + ""));
			}
			System.out.println(num.intValue());
			System.out.println(divisor.intValue());
			System.out.println(num.longValue());
			return num.divide(divisor).intValue();
		}
	}

	// 官方题解，及时除数，就可以避免溢出【我觉得挺离谱的
//	class Solution {
//	    public int uniquePaths(int m, int n) {
//	        long ans = 1;
//	        for (int x = n, y = 1; y < m; ++x, ++y) {
//	            ans = ans * x / y;
//	        }
//	        return (int) ans;
//	    }
//	}

//	超出int数据范围，会出现溢出，用大数类
//	class Solution {
//		public int uniquePaths(int m, int n) {
//
//			int b = Math.min(m, n) - 1;
//			if (b == 0)
//				return 1;
//			int a = m + n - 2;
//			long num = 1;
//			long divisor = 1;
//			for (int i = 0; i < b; i++) {
//				num = num * a--;
//			}
//			for (int i = 1; i <= b; i++) {
//				divisor = divisor * i;
//			}
//			System.out.println(num);
//			System.out.println(divisor);
//			long result = num / divisor;
//			return (int) result;
//		}
//	}
}
