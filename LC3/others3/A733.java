package others3;

import java.util.HashSet;
import java.util.Set;

public class A733 {
	public Set<Integer[]> set = new HashSet<>();
	int newColor;
	int oldColor;

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		if (newColor == image[sr][sc])
			return image;
		this.newColor = newColor;
		this.oldColor = image[sr][sc];
		dfs(image, sr, sc);
		return image;
	}

	public void dfs(int[][] image, int sr, int sc) {
		if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != oldColor)
			return;
		image[sr][sc] = this.newColor;
		dfs(image, sr - 1, sc);
		dfs(image, sr, sc - 1);
		dfs(image, sr + 1, sc);
		dfs(image, sr, sc + 1);

	}
}
