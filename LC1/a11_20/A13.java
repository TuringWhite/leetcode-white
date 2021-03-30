package a11_20;

public class A13 {
//	I             1
//	V             5
//	X             10
//	L             50
//	C             100
//	D             500
//	M             1000

	class Solution {
		public int romanToInt(String s) {
			int sum = 0;
			int pre = getValue(s.charAt(0));
			for (int i = 1; i < s.length(); i++) {
				int num = getValue(s.charAt(i));
				if (num > pre)
					sum -= pre;
				else
					sum += pre;
				pre = num;
			}
			return sum + pre;
		}

		public int getValue(char ch) {
			switch (ch) {
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
			default:
				return -1;
			}
		}
	}

	public static void main(String[] args) {

		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("IV"));
		System.out.println(romanToInt("IX"));

		System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("MCMXCIV"));
		System.out.println(romanToInt("XLIX"));
		System.out.println(romanToInt("CMXCIX"));
		System.out.println(romanToInt(""));

	}

	public static int romanToInt(String s) {
		int num = 0;
		if (s.contains("CD")) {
			num += 400;
			s = s.replace("CD", "");
		}
		if (s.contains("CM")) {
			num += 900;
			s = s.replace("CM", "");
		}
		if (s.contains("XL")) {
			num += 40;
			s = s.replace("XL", "");
		}
		if (s.contains("XC")) {
			num += 90;
			s = s.replace("XC", "");
		}
		if (s.contains("IV")) {
			num += 4;
			s = s.replace("IV", "");
		}
		if (s.contains("IX")) {
			num += 9;
			s = s.replace("IX", "");
		}
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
			case 'M':
				num += 1000;
				break;
			case 'D':
				num += 500;
				break;
			case 'C':
				num += 100;
				break;
			case 'L':
				num += 50;
				break;
			case 'X':
				num += 10;
				break;
			case 'V':
				num += 5;
				break;
			case 'I':
				num += 1;
				break;
			}
		}
		return num;
	}
}
