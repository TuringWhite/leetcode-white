package others4;

public class A922 {
	public int[] sortArrayByParityII(int[] A) {
		int quick = 1, slow = 0;
		while (quick < A.length) {
			while (quick < A.length && A[quick] % 2 != 0) {
				quick = quick + 2;
			}
			while (slow < A.length && A[slow] % 2 != 1) {
				slow = slow + 2;
			}
			if (quick >= A.length || slow >= A.length)
				return A;
			if (A[quick] % 2 == 0 && A[slow] % 2 == 1) {
				int temp = A[quick];
				A[quick] = A[slow];
				A[slow] = temp;
			}
		}
		return A;
	}
}
