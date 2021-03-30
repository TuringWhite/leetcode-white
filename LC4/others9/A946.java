package others9;

public class A946 {
	class Solution {
		public boolean validateStackSequences(int[] pushed, int[] popped) {
			int[] stack = new int[pushed.length];
			int cur = -1;
			int i = 0;
			for (int num : pushed) {
				cur++;
				stack[cur] = num;
				while (cur >= 0 && stack[cur] == popped[i]) {
					cur--;
					i++;
				}
			}
			return i == popped.length;
		}
	}
}
