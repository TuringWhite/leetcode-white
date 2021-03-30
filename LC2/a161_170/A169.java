package a161_170;

import java.util.Arrays;

public class A169 {

	class Solution {
		public int majorityElement(int[] nums) {
			Arrays.sort(nums);
			return nums[nums.length / 2];
		}
	}

//	public static void main(String[] args) {
//		System.out.println(majorityElement(new int[] {3,2,3}));
//		System.out.println(majorityElement(new int[] {2,2,1,1,1,2,2}));
//		System.out.println(majorityElement(new int[] {}));
//		System.out.println(majorityElement(new int[] {0}));
//		System.out.println(majorityElement(new int[] {1}));
//		System.out.println(majorityElement(new int[] {1,2}));
//		
//	}
//    public static int majorityElement(int[] nums) {
//    	Map<Integer, Integer> map =new HashMap<Integer, Integer>();
//    	for(int i = 0;i<nums.length;i++) {
//    		if(map.containsKey(nums[i])) {
//        		map.put(nums[i], map.get(nums[i])+1);
//    		}else {
//				map.put(nums[i], 1);
//			}
//
//    		if(map.get(nums[i])>nums.length/2) {
//    			return nums[i];
//    		}
//    	}
//    	return -1;
//    }
}
