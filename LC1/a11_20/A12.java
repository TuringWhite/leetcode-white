package a11_20;

public class A12 {
	class Solution {
		public String intToRoman(int num) {
			StringBuilder stringBuilder = new StringBuilder();
			int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
			String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
			for (int i = 0; i < values.length; i++) {
				int j = num / values[i];
				num = num % values[i];
				while (j-- > 0)
					stringBuilder.append(symbols[i]);
			}
			return stringBuilder.toString();
		}
	}
//	I             1
//	V             5
//	X             10
//	L             50
//	C             100
//	D             500
//	M             1000

	public static void main(String[] args) {
		System.out.println(intToRoman(0));
		System.out.println(intToRoman(4));
		System.out.println(intToRoman(9));
		System.out.println(intToRoman(58));

		System.out.println(intToRoman(1994));
		System.out.println(intToRoman(3999));

	}

	public static String intToRoman(int num) {
		StringBuffer sBuffer = new StringBuffer();
		num = first(num, 'M', 1000, sBuffer);
		num = second(num, 1000, 900, sBuffer, "CM");
		num = first(num, 'D', 500, sBuffer);
		num = second(num, 500, 400, sBuffer, "CD");
		num = first(num, 'C', 100, sBuffer);
		num = second(num, 100, 90, sBuffer, "XC");
		num = first(num, 'L', 50, sBuffer);
		num = second(num, 50, 40, sBuffer, "XL");
		num = first(num, 'X', 10, sBuffer);
		num = second(num, 10, 9, sBuffer, "IX");
		num = first(num, 'V', 5, sBuffer);
		num = second(num, 5, 4, sBuffer, "IV");
		num = first(num, 'I', 1, sBuffer);
		return sBuffer.toString();
	}

	public static int first(int num, char add, int x, StringBuffer sBuffer) {
		if (num / x > 0) {
			for (int i = 0; i < num / x; i++)
				sBuffer.append(add);
			num = num % x;
		}
		return num;
	}

	public static int second(int num, int big, int small, StringBuffer sBuffer, String add) {
		if (num < big && num >= small) {
			sBuffer.append(add);
			num = num - small;
		}
		return num;
	}
}
