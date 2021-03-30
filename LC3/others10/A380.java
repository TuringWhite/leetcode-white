package others10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A380 {
	class RandomizedSet {

		Set<Integer> set;
		List<Integer> list;

		/** Initialize your data structure here. */
		public RandomizedSet() {
			set = new HashSet<>();
			list = new ArrayList<Integer>();
		}

		/**
		 * Inserts a value to the set. Returns true if the set did not already contain
		 * the specified element.
		 */
		public boolean insert(int val) {
			if (set.contains(val))
				return false;
			set.add(val);
			list.add(val);
			return true;
		}

		/**
		 * Removes a value from the set. Returns true if the set contained the specified
		 * element.
		 */
		public boolean remove(int val) {
			if (set.contains(val)) {
				set.remove(val);
				for (int i = 0; i < list.size(); i++) {
					if (val == list.get(i)) {
						list.remove(i);
						break;
					}
				}
				return true;
			} else {
				return false;
			}

		}

		/** Get a random element from the set. */
		public int getRandom() {
			if (list.size() > 0) {
				return list.get((int) (Math.random() * list.size()));
			}
			return -1;
		}
	}
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet(); boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val); int param_3 = obj.getRandom();
 */
