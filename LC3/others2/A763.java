package others2;

import java.util.ArrayList;
import java.util.List;

public class A763 {
	public static List<Integer> partitionLabels(String S) {
//当前子串的第一个字符从后遍历，找到最后一个出现的位置，中间的子串拿出来，找这些字符的最后一个出现地方，循环，直到子串里的字符不存在于剩余子串。当前子串入list
//剩余子串替代当前子串，循环上一步，直到遍历到最后一个字符位置
		List<Integer> list = new ArrayList<Integer>();
		char[] arr = S.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			char comparedChar = arr[i];
			int last = S.lastIndexOf(comparedChar);
			int j = i + 1;
			while (j < last) {
				last = last > S.lastIndexOf(arr[j]) ? last : S.lastIndexOf(arr[j]);
				j++;
			}
			list.add(last - i+ 1);
			i = last;
		}
		return list;
	}
}
