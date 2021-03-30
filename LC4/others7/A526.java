package others7;

public class A526 {
	class Solution {
		int ans = 0;
		int num;

		public int countArrangement(int N) {
			int[] flag = new int[N + 1];
			int[] arr = new int[N + 1];
			this.num = N;
			back(arr, 0, flag);
			return ans;
		}

		public void back(int[] arr, int n, int[] flag) {
			if (n == 0 || arr[n] % n == 0 || n % arr[n] == 0) {
				if (n == num) {
					ans++;
					return;
				}
				for (int i = 1; i <= num; i++) {
					if (flag[i] == 0) {
						flag[i] = 1;
						arr[n + 1] = i;
						back(arr, n + 1, flag);
						arr[n + 1] = 0;
						flag[i] = 0;
					}
				}
			}

		}
	}
}
