package others1;

public class A344 {

	public static void reverseString(char[] s) {
		char temp;
		for (int i = 0, j = s.length-1; i < j; i++, j--) {
			temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
	}
}
