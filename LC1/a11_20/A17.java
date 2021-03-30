package a11_20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class A17 {
	class Solution {
		public List<String> letterCombinations(String digits) {
			if (digits.length() == 0)
				return new ArrayList<>();
			Queue<String> queue = new LinkedList<String>();
			queue.add("");
			char[] input = digits.toCharArray();
			for (int i = 0; i < input.length; i++) {
				int size = queue.size();
				for (int j = 0; j < size; j++) {
					String temp = queue.poll();
					switch (input[i]) {
					case '2':
						queue.offer(temp + "a");
						queue.offer(temp + "b");
						queue.offer(temp + "c");
						break;
					case '3':
						queue.offer(temp + "d");
						queue.offer(temp + "e");
						queue.offer(temp + "f");
						break;
					case '4':
						queue.offer(temp + "g");
						queue.offer(temp + "h");
						queue.offer(temp + "i");
						break;
					case '5':
						queue.offer(temp + "j");
						queue.offer(temp + "k");
						queue.offer(temp + "l");
						break;
					case '6':
						queue.offer(temp + "m");
						queue.offer(temp + "n");
						queue.offer(temp + "o");
						break;
					case '7':
						queue.offer(temp + "p");
						queue.offer(temp + "q");
						queue.offer(temp + "r");
						queue.offer(temp + "s");
						break;
					case '8':
						queue.offer(temp + "t");
						queue.offer(temp + "u");
						queue.offer(temp + "v");
						break;
					case '9':
						queue.offer(temp + "w");
						queue.offer(temp + "x");
						queue.offer(temp + "y");
						queue.offer(temp + "z");
						break;
					}
				}
			}
			List<String> resutl = new ArrayList<String>();
			while (!queue.isEmpty()) {
				resutl.add(queue.poll());
			}
			return resutl;
		}
	}
}
