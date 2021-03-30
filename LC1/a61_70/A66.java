package a61_70;

public class A66 {
	class Solution {
		public int[] plusOne(int[] digits) {
			int carry = 1;
			for (int i = digits.length - 1; i >= 0; i--) {
				carry = (digits[i] + carry) / 10;
				if (carry == 0) {
					digits[i] = digits[i] + 1;
					return digits;
				} else {
					digits[i] = 0;
				}
			}
			int[] ans = new int[digits.length + 1];
			ans[0] = 1;
			for (int i = 0; i < digits.length; i++) {
				ans[i + 1] = digits[i];
			}
			return ans;
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3 };
		int[] arr2 = new int[] { 4, 3, 2, 1 };
		int[] arr3 = plusOne(arr);
		int[] arr4 = plusOne(arr2);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + "_");
		}
		System.out.println();
		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + "_");
		}
		System.out.println();
		int[] arr5 = new int[] { 0 };
		int[] arr6 = new int[] { 9, 9, 9, 9 };
		int[] arr7 = plusOne(arr5);
		int[] arr8 = plusOne(arr6);
		for (int i = 0; i < arr7.length; i++) {
			System.out.print(arr7[i] + "_");
		}
		System.out.println();
		for (int i = 0; i < arr8.length; i++) {
			System.out.print(arr8[i] + "_");
		}
	}

	public static int[] plusOne(int[] digits) {
		digits[digits.length - 1]++;
		for (int j = digits.length - 1; j > 0; j--) {
			if (digits[j] == 10) {
				digits[j] = 0;
				digits[j - 1]++;
			} else {
				break;
			}
		}
		if (digits[0] == 10) {
			int[] arr = new int[digits.length + 1];
			arr[0] = 1;
			arr[1] = 0;
			for (int i = 2; i < digits.length; i++) {
				arr[i] = digits[i - 1];
			}
			return arr;
		} else {
			return digits;
		}
	}
}
