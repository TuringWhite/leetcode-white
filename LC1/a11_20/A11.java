package a11_20;

public class A11 {
	public static int maxArea(int[] height) {
		int contain = 0;
		int left = 0;
		int right = height.length - 1;
		while (left != right) {
			contain = contain > (right - left) * Math.min(height[left], height[right]) ? contain
					: (right - left) * Math.min(height[left], height[right]);
			if (height[left] > height[right]) {
				right--;
			} else {
				left++;
			}
		}
		return contain;
	}

//	public static int maxArea(int[] height) {
//		int contain = 0;
//		for (int i = 0; i < height.length - 1; i++) {
//			for (int j = i + 1; j < height.length; j++) {
//				contain = contain > (j - i) * Math.min(height[i], height[j]) ? contain
//						: (j - i) * Math.min(height[i], height[j]);
//			}
//		}
//		return contain;
//	}
}
