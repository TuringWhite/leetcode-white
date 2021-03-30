package others9;

public class A1598 {
	class Solution {
		public int minOperations(String[] logs) {
			int cur = 0;
			for (String log : logs) {
				switch (log) {
				case "../":
					if (cur > 0)
						--cur;
					break;
				case "./":
					break;
				default:
					++cur;
					break;
				}
			}
			return cur;
		}
	}
}
