package others7;

public class A299 {
	class Solution {
		public String getHint(String secret, String guess) {
			int A = 0;
			int[] mapS = new int[10];
			int[] mapG = new int[10];
			for (int i = 0; i < guess.length(); i++) {
				if (secret.charAt(i) == guess.charAt(i)) {
					A++;
				} else {
					mapS[secret.charAt(i) - '0']++;
					mapG[guess.charAt(i) - '0']++;
				}
			}
			int B = 0;
			for (int i = 0; i < 10; i++) {
				B += Math.min(mapS[i], mapG[i]);
			}
			return A + "A" + B + "B";
		}
	}
}
