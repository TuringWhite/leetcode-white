package others9;

public class A705 {
	class MyHashSet {
		private int[][] arr;
		private boolean[][] flag;

		/** Initialize your data structure here. */
		public MyHashSet() {
			arr = new int[10001][100];
			flag = new boolean[10001][100];
		}

		public void add(int key) {
			if (!flag[key / 100][key % 100]) {
				arr[key / 100][key % 100] = key;
				flag[key / 100][key % 100] = true;
			}
		}

		public void remove(int key) {
			if (flag[key / 100][key % 100]) {
				flag[key / 100][key % 100] = false;
			}
		}

		/** Returns true if this set contains the specified element */
		public boolean contains(int key) {
			return flag[key / 100][key % 100];
		}
	}

	/**
	 * Your MyHashSet object will be instantiated and called as such: MyHashSet obj
	 * = new MyHashSet(); obj.add(key); obj.remove(key); boolean param_3 =
	 * obj.contains(key);
	 */
}
