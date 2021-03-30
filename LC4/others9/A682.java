package others9;

public class A682 {
	class Solution {
		public int calPoints(String[] ops) {
			int[] arr = new int[ops.length];
			int cur = -1;
			for (String op : ops) {
				switch (op) {
				case "+":
					++cur;
					arr[cur] = arr[cur - 1] + arr[cur - 2];
					break;

				case "D":
					++cur;
					arr[cur] = 2 * arr[cur - 1];
					break;
				case "C":
					--cur;
					break;

				default:
					++cur;
					arr[cur] = Integer.valueOf(op);
					break;
				}
			}
			int ans = 0;
			for (int i = 0; i <= cur; i++) {
				System.out.println(arr[i]);
				ans += arr[i];
			}
			return ans;
		}
	}
}
