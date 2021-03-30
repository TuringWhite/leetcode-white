package others9;

public class A706 {
	class MyHashMap {
		private int[][][] arr;
		private boolean[][] flag;

		/** Initialize your data structure here. */
		public MyHashMap() {
			arr = new int[10001][100][2];
			flag = new boolean[10001][100];
		}

		/** value will always be non-negative. */
		public void put(int key, int value) {

			arr[key / 100][key % 100][0] = key;
			arr[key / 100][key % 100][1] = value;
			flag[key / 100][key % 100] = true;

		}

		/**
		 * Returns the value to which the specified key is mapped, or -1 if this map
		 * contains no mapping for the key
		 */
		public int get(int key) {
			if (flag[key / 100][key % 100]) {
				return arr[key / 100][key % 100][1];
			}
			return -1;
		}

		/**
		 * Removes the mapping of the specified value key if this map contains a mapping
		 * for the key
		 */
		public void remove(int key) {
			if (flag[key / 100][key % 100]) {
				flag[key / 100][key % 100] = false;
			}
		}
	}

	/**
	 * Your MyHashMap object will be instantiated and called as such: MyHashMap obj
	 * = new MyHashMap(); obj.put(key,value); int param_2 = obj.get(key);
	 * obj.remove(key);
	 */
}
