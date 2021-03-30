package others7;

public class A423 {
	class Solution {
		public String originalDigits(String s) {
			int[] arr = new int[10];
			for (char ch : s.toCharArray()) {
				switch (ch) {
				case 'z':
					arr[0]++;
					break;
				case 'o':
					arr[1]++;
					break;
				case 'w':
					arr[2]++;
					break;
				case 'h':
					arr[3]++;
					break;
				case 'u':
					arr[4]++;
					break;
				case 'f':
					arr[5]++;
					break;
				case 'x':
					arr[6]++;
					break;
				case 'v':
					arr[7]++;
					break;
				case 'g':
					arr[8]++;
					break;
				case 'i':
					arr[9]++;
					break;
				default:
					break;
				}
			}
			int[] help = new int[10];
			int temp = arr[0];
			help[0] = temp;
			arr[1] -= temp;

			temp = arr[2];
			help[2] = temp;
			arr[1] -= temp;

			temp = arr[4];
			help[4] = temp;
			arr[5] -= temp;
			arr[1] -= temp;

			temp = arr[8];
			help[8] = temp;
			arr[9] -= temp;
			arr[3] -= temp;

			temp = arr[1];
			help[1] = temp;

			help[3] = arr[3];

			temp = arr[5];
			help[5] = temp;
			arr[7] -= temp;
			arr[9] -= temp;

			help[6] = arr[6];
			arr[9] -= arr[6];

			help[7] = arr[7];

			help[9] = arr[9];
			StringBuilder sBuilder = new StringBuilder();
			for (int i = 0; i < help.length; i++) {
				for (int j = 0; j < help[i]; j++) {
					sBuilder.append(i);
				}
			}
			return sBuilder.toString();
		}
	}
}
