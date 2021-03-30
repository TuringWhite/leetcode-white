package others8;

public class A857 {
	class Solution {
		public int findCircleNum(int[][] isConnected) {
			int ans = 0;
			int length = isConnected.length;
			for (int i = 0; i < length; i++) {
				for (int j = 0; j < length; j++) {
					if (isConnected[i][j] == 1) {
						ans++;
						dfs(isConnected, i, j);
					}
				}
			}
			return ans;
		}

		public void dfs(int[][] A, int i, int j) {
			if (i < 0 || i >= A.length || j < 0 || j >= A.length || A[i][j] == 0)
				return;
			A[i][j] = 0;
			dfs(A, i - 1, j);
			dfs(A, i + 1, j);
			dfs(A, i, j - 1);
			dfs(A, i, j + 1);
		}
	}

}

class Solution {
	public int findCircleNum(int[][] isConnected) {
		// int[][] isConnected 是无向图的邻接矩阵，n 为无向图的顶点数量
		int n = isConnected.length;
		// 定义 boolean 数组标识顶点是否被访问
		boolean[] visited = new boolean[n];
		// 定义 cnt 来累计遍历过的连通域的数量
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			// 若当前顶点 i 未被访问，说明又是一个新的连通域，则遍历新的连通域且cnt+=1.
			if (!visited[i]) {
				cnt++;
				dfs(i, isConnected, visited);
			}
		}
		return cnt;
	}

	private void dfs(int i, int[][] isConnected, boolean[] visited) {
		// 对当前顶点 i 进行访问标记
		visited[i] = true;

		// 继续遍历与顶点 i 相邻的顶点（使用 visited 数组防止重复访问）
		for (int j = 0; j < isConnected.length; j++) {
			if (isConnected[i][j] == 1 && !visited[j]) {
				dfs(j, isConnected, visited);
			}
		}
	}
}
