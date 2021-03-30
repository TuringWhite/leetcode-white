package a71_80;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class A71 {
	public String simplifyPath(String path) {
		if (path.length() == 0) {
			return "";
		}
		String[] arr = path.split("/");
		List<String> list = new LinkedList<>();
		Stack<String> stack = new Stack<>();
		for (String string : arr) {
			if (!string.equals(""))
				list.add(string);
		}
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).equals(".")) {

			} else if (list.get(i).equals("..")) {
				if (!stack.isEmpty())
					stack.pop();
			} else {
				stack.add(list.get(i));
			}
		}

		if (stack.isEmpty())
			return "/";
		else {
			StringBuffer sBuffer = new StringBuffer();
			while (!stack.isEmpty()) {
				sBuffer.insert(0, "/" + stack.pop());
			}
			return sBuffer.toString();
		}

	}

	// 记录一个题解看到的，一样思路，但是他的处理比较巧妙，我在一开始处理输入的时候，将""这个情况手动过滤了，下面这个，用几个if把这情况直接筛掉了
	public String simplifyPath2(String path) {
		String[] pathArray = path.split("/");
		// 分割后的几种情况 空格说明是多出来的/，.. .与目录
		StringBuilder res = new StringBuilder();
		Deque<String> stack = new ArrayDeque<>();
		for (int i = 0; i < pathArray.length; i++) {
			// 2种情况，栈为空或者栈不为空
			if (pathArray[i].length() == 0 || pathArray[i].equals("."))
				continue;
			if (!stack.isEmpty()) {
				if (pathArray[i].equals("..")) {
					stack.pop();
				} else {
					stack.push(pathArray[i]);
				}
			} else {
				if (!pathArray[i].equals(".."))
					stack.push(pathArray[i]);
			}
		}
		if (stack.isEmpty())
			return res.append('/').toString();
		while (!stack.isEmpty()) {
			res.insert(0, stack.pop());
			res.insert(0, '/');
		}
		return res.toString();
	}

}
