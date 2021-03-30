package others6;

public class A345 {
	public static void main(String[] args) {
		System.out.println(reverseVowels("leetcodeleetcode"));
	}

	public static String reverseVowels(String s) {

		char[] arr = s.toCharArray();
		int left = 0, right = s.length() - 1;
		while (left < right) {
			while (left < right && !isaeiou(arr[left])) {
				left++;
			}
			while (left < right && !isaeiou(arr[right])) {
				right--;
			}
			if (left < right) {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return String.valueOf(arr);
	}

	public static boolean isaeiou(char input) {
		switch (input) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			return true;
		}
		return false;
	}

}
