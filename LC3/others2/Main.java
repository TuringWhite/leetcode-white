package others2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- != 0) {
			int para = sc.nextInt();
			int count = 1;
			if (para == 1)
				count = 0;
			while (para > 3) {
				para = para / 3 + para % 3;
				count++;
			}
			System.out.println(count);
		}

		sc.close();
	}
}

//}
//while (n-- != 0) {
//	int para = sc.nextInt();
//	int i = 2, j = 1;
//	if (para == 1)
//		System.out.println(1);
//	while (i < para) {
//		i *= 2;
//		j++;
//	}
//	System.out.println(j);
//