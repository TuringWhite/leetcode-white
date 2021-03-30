package a81_90;

public class A84 {
	class Solution {
		public int largestRectangleArea(int[] heights) {
			int max = 0;
			int length = heights.length;
			int left, right;
			for (int i = 0; i < length; i++) {
				left = right = i;
				while (left >= 0 && heights[left] >= heights[i]) {
					left--;
				}
				while (right < length && heights[right] >= heights[i]) {
					right++;
				}
				max = Math.max(max, heights[i] * (right - left - 1));
			}
			return max;
		}
	}
}
