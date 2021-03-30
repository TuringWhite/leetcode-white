package a11_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A18 {
	
	
//	[-2,-1,-1,1,1,2,2]
//			0
//			[1,-2,-5,-4,-3,3,3,5]
//					-11
//					[0,0,0,0]
//							0
	// 剪个锤子枝，不剪了,下面这段代码改自threesum，过了！！！跟三数之和有区别，但是去重我处理不好，直接全注释了:)
	class Solution {
		public List<List<Integer>> fourSum(int[] nums, int target) {
			Arrays.sort(nums);
			List<List<Integer>> result = new ArrayList<List<Integer>>();
			int l, r, dummy;
			for (int j = 0; j < nums.length - 3; j++) {
				dummy = target - nums[j];
				for (int i = j + 1; i < nums.length - 2; ++i) {
//					if (nums[i] > dummy)
//						break;
//					if (i > 0 && nums[i] == nums[i - 1])
//						continue;
					l = i + 1;
					r = nums.length - 1;
					int sum = dummy - nums[i];
					while (l < r) {
						if (nums[l] + nums[r] == sum) {
							List<Integer> list = new ArrayList<>();
							list.add(nums[i]);
							list.add(nums[l]);
							list.add(nums[r]);
							list.add(nums[j]);
							list.sort(null);
							if (!result.contains(list)) {
								result.add(list);
							}
							++l;
							--r;
							while (l < r && nums[l] == nums[l - 1])
								l++;
							while (l < r && nums[r] == nums[r + 1])
								r--;

						} else if (nums[l] + nums[r] > sum) {
							--r;
						} else {
							++l;
						}
					}
				}
			}
			return result;
		}
	}
}
