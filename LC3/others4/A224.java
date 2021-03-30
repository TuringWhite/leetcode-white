package others4;

import java.util.Stack;

public class A224 {
	public int calculate(String s) {
		s = s.replaceAll(" ", "");
		// 放每个数字
		Stack<Integer> dig = new Stack<>();
		// 记录左括号位置
		Stack<Integer> helper = new Stack<>();
		// 记录加减符号
		Stack<Character> pr = new Stack<Character>();
		char[] arr = s.toCharArray();
		// 入栈，这个循环回处理掉所有括号
		for (int i = 0; i < arr.length; i++) {
			if (!dig.isEmpty())
				System.out.println(dig.peek() + "          " + pr.size() + "           " + dig.size());
			if (arr[i] == '(') {
				helper.add(dig.size());
			} else if (arr[i] == '+' || arr[i] == '-') {
				pr.add(arr[i]);
			} else if (arr[i] <= '9' && arr[i] >= '0') {
				int temp = arr[i] - '0';
				while (i < s.length() - 1 && arr[i + 1] <= '9' && arr[i + 1] >= '0') {
					temp = temp * 10 + (arr[++i] - '0');
				}
				if (!pr.isEmpty() && !helper.isEmpty() && dig.size() > helper.peek() + 1) {
					int another = dig.pop();
					switch (pr.pop()) {
					case '+':
						dig.push(another + temp);
						break;

					case '-':
						dig.push(another - temp);
						break;
					}

				} else {
					dig.add(temp);
				}

			} else {
				//
				if (pr.isEmpty()) {
					helper.pop();
				} else {

					helper.pop();
					int temp = dig.pop();
					switch (pr.pop()) {
					case '+':
						temp = dig.pop() + temp;
						break;

					case '-':
						temp = dig.pop() - temp;
						break;
					}

					dig.add(temp);
				}
			}
		}
		while (!pr.isEmpty()) {
			int temp = dig.pop();
			switch (pr.pop()) {
			case '+':
				temp = dig.pop() + temp;
				break;

			case '-':
				temp = dig.pop() - temp;
				break;
			}

			dig.add(temp);
		}
		System.out.println(dig.size() + "        " + pr.size());
		return dig.pop();
	}
}

//"(1+(4+5+2)-3)+(6+8)"
//"1"
//"2"
//"1-1"
//"(1)"
//"(1-(3-4))"
//" 2-1+2"

//一个夭折的方法，Stack开成了Character，不好改了，直接重写
//public int calculate(String s) {
//	char[] arr = s.toCharArray();
//	Stack<Character> stack = new Stack<>();
//	for (int i = 0; i < arr.length; i++) {
//		if (arr[i] == ' ') {
//			continue;
//		} else if (arr[i] == '(') {
//			stack.add('(');
//		} else if (arr[i] <= '9' && arr[i] >= '0') {
//			if (stack.peek() != '(') {
//				switch (stack.pop()) {
//				case '+':
//					arr[i] = stack.pop() - '0' + arr[i];
//					break;
//
//				default:
//					arr[i] = stack.pop() - '0' - arr[i];
//					break;
//				}
//			} else {
//				stack.add(arr[i]);
//			}
//		} else if (arr[i] == '+' || arr[i] == '-') {
//			stack.add(arr[i]);
//		} else {
//			int temp = stack.pop();
//
//		}
//	}
//}