package others4;

public class A553 {
	class Solution {
		public String optimalDivision(int[] nums) {
			if (nums.length == 1)
				return nums[0] + "";
			if (nums.length == 2) {
				return nums[0] + "/" + nums[1];
			}
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append(nums[0]);
			stringBuffer.append("/(");
			for (int i = 1; i < nums.length; i++) {
				stringBuffer.append(nums[i] + "/");
			}
			stringBuffer.deleteCharAt(stringBuffer.length() - 1);
			stringBuffer.append(")");
			return stringBuffer.toString();
		}
	}
}
