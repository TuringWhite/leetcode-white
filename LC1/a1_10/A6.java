package a1_10;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class A6 {

	class Solution {
		public String convert(String s, int numRows) {
			if (numRows == s.length() || numRows == 1)
				return s;
			StringBuilder sBuilder = new StringBuilder();
			for (int i = 0; i < numRows; i++) {
				if (i == 0 || i == numRows - 1) {
					for (int j = i; j < s.length(); j += 2 * numRows - 2) {
						sBuilder.append(s.charAt(j));
					}
				} else {
					for (int j = i; j < s.length(); j += 2 * numRows - 2) {
						sBuilder.append(s.charAt(j));
						if (j + 2 * numRows - 2 - 2 * i < s.length())
							sBuilder.append(s.charAt(j + 2 * numRows - 2 - 2 * i));
					}
				}
			}
			return sBuilder.toString();
		}
	}

	public static void main(String[] args) {
		convert("a", 1);
		convert("LEETCODEISHIRING", 3);
		convert("LEETCODEISHIRING", 4);
	}

	@Test
	public void test() {
		System.out.println(convert("A", 1));
		assertEquals(convert("A", 1), "A");
		System.out.println(convert("LEETCODEISHIRING", 3));
		assertEquals(convert("LEETCODEISHIRING", 3), "LCIRETOESIIGEDHN");
		System.out.println(convert("LEETCODEISHIRING", 4));
		assertEquals(convert("LEETCODEISHIRING", 4), "LDREOEIIECIHNTSG");
	}

	public static String convert(String s, int numRows) {
		if (numRows == 1)
			return s;
		StringBuffer sBuffer = new StringBuffer();
		char[] array = s.toCharArray();
		for (int i = 0; i < numRows; i++) {
			if (i == 0 || i == numRows - 1) {
				for (int j = 0, x = i; x < array.length; j++, x = i + j * (2 * numRows - 2)) {
//					System.out.println(x + "     " + array[x]);
					sBuffer.append(array[x]);
				}
			} else {
				for (int j = 0, x = i; x < array.length; j++, x = i + j * (2 * numRows - 2)) {
//					System.out.println(x + "     " + array[x]);
					sBuffer.append(array[x]);
					if ((x + (2 * numRows - 2 * i - 2)) < array.length) {
//						System.out.println(
//								(x + (2 * numRows - 2 * i - 2)) + "     " + array[x + (2 * numRows - 2 * i - 2)]);
						sBuffer.append(array[x + (2 * numRows - 2 * i - 2)]);
					}
				}
			}
		}
//		System.out.println(sBuffer.toString());
//		System.out.println("LCIRETOESIIGEDHN");
		return sBuffer.toString();
	}
}
