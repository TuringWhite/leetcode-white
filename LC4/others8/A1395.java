package others8;

public class A1395 {
	class Solution {
		public int numTeams(int[] rating) {
			int count = 0;
			int length = rating.length;
			for (int i = 0; i < length - 2; i++)
				for (int j = i + 1; j < length - 1; j++)
					for (int cur = j + 1; cur < length; cur++)
						if ((rating[i] > rating[j] && rating[j] > rating[cur])
								|| (rating[i] < rating[j] && rating[j] < rating[cur]))
							count++;
			return count;
		}
	}
}
