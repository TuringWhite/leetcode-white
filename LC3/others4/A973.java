package others4;

import java.util.Arrays;

public class A973 {
	

	//直接暴力，一阵操作猛如虎，一看击败5%
	public int[][] kClosest(int[][] points, int K) {
		int[] length = new int[points.length];
		int[][] arr = new int[points.length][3];
		int[][] resutl = new int[K][2];
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = points[i][0];
			arr[i][1] = points[i][1];
			arr[i][2] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
			length[i] = arr[i][2];
		}
		Arrays.sort(length);

		int i = 0;
		int j = 0;
		while (K > 0) {
			if (i < points.length) {
				if (arr[i][2] == length[j]) {
					resutl[K - 1][0] = arr[i][0];
					resutl[K - 1][1] = arr[i][1];
					K--;
				}
				i++;
			} else {
				i = 0;
				j++;
			}
		}
		return resutl;
	}
	
	//官方题解，精妙的Arrays操作，还有这个排序，反正我是不会这个方法

//	class Solution {
//	    public int[][] kClosest(int[][] points, int K) {
//	        Arrays.sort(points, new Comparator<int[]>() {
//	            public int compare(int[] point1, int[] point2) {
//	                return (point1[0] * point1[0] + point1[1] * point1[1]) - (point2[0] * point2[0] + point2[1] * point2[1]);
//	            }
//	        });
//	        return Arrays.copyOfRange(points, 0, K);
//	    }
//	}


	// 没有考虑K这个参数的，返回了所有圆上的点
//	public int[][] kClosest(int[][] points, int K) {
//		int min = Integer.MAX_VALUE;
//		int[][] arr = new int[points.length][3];
//		int[][] resutl;
//		int count = 0;
//		for (int i = 0; i < arr.length; i++) {
//			arr[i][0] = points[i][0];
//			arr[i][1] = points[i][1];
//			arr[i][2] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
//			if (min > arr[i][2]) {
//				min = arr[i][2];
//				count = 1;
//			} else if (min == arr[i][2]) {
//				count++;
//			}
//		}
//		resutl = new int[count][2];
//		int i = 0;
//		while (count > 0) {
//			if (arr[i][2] == min) {
//				resutl[count - 1][0] = arr[i][0];
//				resutl[count - 1][1] = arr[i][1];
//				count--;
//			}
//			i++;
//		}
//		return resutl;
//	}
}
