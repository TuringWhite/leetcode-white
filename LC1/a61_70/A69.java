package a61_70;

public class A69 {
	public static void main(String[] args) {
//		System.out.println(mySqrt(0));
//		System.out.println(mySqrt(8));
//		System.out.println(mySqrt(15));
//		System.out.println(mySqrt(24));
		System.out.println(mySqrt(25));
		System.out.println(mySqrt(4));
		System.out.println(mySqrt(6));
		System.out.println(mySqrt(9));
		System.out.println(mySqrt(17));
//		System.out.println(mySqrt(26));
		System.out.println(mySqrt(2147395600));

	}

	public static int mySqrt(int x) {
		long i = 0;
		while (true) {
			if (((i + 1) * (i + 1)) > x) {
//				System.out.println((i + 1) * (i + 1));
				return (int) i;

			}
			i++;
		}
	}
}
