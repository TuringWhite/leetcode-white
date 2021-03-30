package others6;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class A950 {
	class Solution {
		public int[] deckRevealedIncreasing(int[] deck) {
			int length = deck.length;
			int[] result = new int[length];
			Arrays.sort(deck);
			Queue<Integer> queue = new LinkedList<>();
			for (int i = 0; i < length; i++) {
				queue.add(i);
			}
			for (int num : deck) {
				result[queue.poll()] = num;
				if (!queue.isEmpty())
					queue.add(queue.poll());
			}
			return result;
		}
	}
}

class Solution {
	public int[] deckRevealedIncreasing(int[] deck) {
		int N = deck.length;
		Deque<Integer> index = new LinkedList<Integer>();
		for (int i = 0; i < N; ++i)
			index.add(i);

		int[] ans = new int[N];
		Arrays.sort(deck);
		for (int card : deck) {
			ans[index.pollFirst()] = card;
			if (!index.isEmpty())
				index.add(index.pollFirst());
		}

		return ans;
	}
}
