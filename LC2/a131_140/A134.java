package a131_140;

public class A134 {
	class Solution {
		public int canCompleteCircuit(int[] gas, int[] cost) {
			int[] helper = new int[gas.length];
			int sum = 0;
			int length = helper.length;
			for (int i = 0; i < helper.length; i++) {
				helper[i] = gas[i] - cost[i];
				sum += helper[i];
			}
			if (sum < 0) {
				return -1;
			} else {
				for (int i = 0; i < length; i++) {
					int count = 0;
					int temp = 0;
					for (int j = i; count < length; j = (j + 1) % length) {
						temp += helper[j];
						count++;
						if (temp < 0)
							break;
					}
					if (count == length)
						return i;
				}
			}
			return -1;
		}
	}

}
