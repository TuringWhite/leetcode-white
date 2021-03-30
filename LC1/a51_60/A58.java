package a51_60;

public class A58 {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("hello world"));
		System.out.println(lengthOfLastWord("hello"));
		System.out.println(lengthOfLastWord("hello world "));
		System.out.println(lengthOfLastWord("h"));
		System.out.println(lengthOfLastWord(""));
		System.out.println(lengthOfLastWord(" "));
		System.out.println(lengthOfLastWord("h "));
		System.out.println(lengthOfLastWord(" h"));
		System.out.println(lengthOfLastWord("b a     "));
	}

	public static int lengthOfLastWord(String s) {
		char[] ch = s.toCharArray();
		int length = 0;
		if (ch.length == 0) {
			return 0;
		} else if (ch.length == 1 && ch[0] == ' ') {
			return 0;
		}
		for (int j = ch.length - 1; j >= 0; j--) {

			if (ch[j] == ' ' && length == 0) {
				continue;
			} else if (ch[j] == ' ' && length != 0) {
				return length;
			}
			length++;
		}
		return length;
	}
}
