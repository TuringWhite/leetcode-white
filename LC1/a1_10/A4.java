package a1_10;

import java.util.Arrays;

public class A4 {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
	}

	class Solution {
		public double findMedianSortedArrays(int[] nums1, int[] nums2) {
			double[] help = new double[nums1.length + nums2.length];
			for (int i = 0; i < nums1.length; i++) {
				help[i] = nums1[i];
			}
			for (int i = nums1.length; i < nums1.length + nums2.length; i++) {
				help[i] = nums2[i - nums1.length];
			}
			Arrays.sort(help);
			if (help.length % 2 == 1) {
				return help[help.length / 2];
			} else {
				return (help[help.length / 2] + help[help.length / 2 - 1]) / 2;
			}
		}
	}
}
