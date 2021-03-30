package a1_10;

public class A9 {
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome(10));

	}

	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int y = 0, z = x;
		while (z != 0) {
			y = y * 10 + z % 10;
			z = z / 10;
		}
		if (x == y)
			return true;
		else
			return false;

	}
}
