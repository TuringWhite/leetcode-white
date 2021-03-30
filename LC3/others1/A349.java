package others1;

import java.util.HashSet;
import java.util.Set;

public class A349 {
	public static void main(String[] args) {
		
		int[] nums1 = new int[] {4,9,5};
		int[] nums2= new int[] {9,4,9,8,4};
		printArr(intersection(nums1, nums2));;
	}
    public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for (int i = 0; i < nums2.length; i++) {
			if (!set1.contains(nums2[i])) {
				set1.add(nums2[i]);
			}
		}
		for (int i = 0; i < nums1.length; i++) {
			if (set1.contains(nums1[i]) && !set2.contains(nums1[i])) {
				set2.add(nums1[i]);
			}
		}
		int[] arr = new int[set2.size()];
		int i = 0;
		for (Integer integer : set2) {
			arr[i++] = integer.intValue();
		}
		return arr;
    }
    public static void printArr(int[] arr) {
    	for(int i = 0;i<arr.length;i++) {
    		System.out.println(arr[i]);
    	}
    }
}
