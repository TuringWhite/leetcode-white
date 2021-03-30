package a81_90;

import java.util.ArrayList;
import java.util.List;

public class A90 {
	class Solution {
		List<List<Integer>> list = new ArrayList<List<Integer>>();

		public List<List<Integer>> subsetsWithDup(int[] nums) {
			List<Integer> temp = new ArrayList<>();
			help(nums, temp, 0);
			return list;
		}

		public void help(int[] nums, List<Integer> temp, int start) {
			temp.sort(null);
			if (!list.contains(temp))
				list.add(temp);
			for (int i = start; i < nums.length; i++) {
				List<Integer> next = new ArrayList<>();
				next.addAll(temp);
				next.add(nums[i]);
				help(nums, next, i+1);

			}
		}
	}
}
//public List<List<Integer>> subsetsWithDup(int[] nums) {
//    List<List<Integer>> ans = new ArrayList<>();
//    Arrays.sort(nums); //排序
//    getAns(nums, 0, new ArrayList<>(), ans);
//    return ans;
//}
//
//private void getAns(int[] nums, int start, ArrayList<Integer> temp, List<List<Integer>> ans) {
//    ans.add(new ArrayList<>(temp));
//    for (int i = start; i < nums.length; i++) {
//        //和上个数字相等就跳过
//        if (i > start && nums[i] == nums[i - 1]) {
//            continue;
//        }
//        temp.add(nums[i]);
//        getAns(nums, i + 1, temp, ans);
//        temp.remove(temp.size() - 1);
//    }
//}
