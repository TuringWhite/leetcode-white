package others3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class A349 {
	public static int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0, j = 0;
		Set<Integer> set = new HashSet<Integer>();
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j]) {
				if (!set.contains(nums1[i])) {
					set.add(nums1[i]);
				}
				i++;
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			}
		}
		int[] result = new int[set.size()];
		int count = 0;
		for (Integer in : set) {
			result[count++] = in;
		}
		return result;
	}
}
