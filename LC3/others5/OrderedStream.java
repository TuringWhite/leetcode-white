package others5;

import java.util.ArrayList;
import java.util.List;

class OrderedStream {

	String[] arr;
	int ptr;

	public OrderedStream(int n) {
		arr = new String[n];
		ptr = 0;
	}

	public List<String> insert(int id, String value) {
		id = id - 1;
		arr[id] = value;
		List<String> list = new ArrayList<String>();
		if (id == ptr) {
			while (ptr < arr.length && arr[ptr] != null) {
				list.add(arr[ptr++]);
			}
		}
		return list;
	}
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n); List<String> param_1 =
 * obj.insert(id,value);
 */