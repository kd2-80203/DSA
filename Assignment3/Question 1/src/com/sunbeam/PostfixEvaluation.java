package com.sunbeam;

public class PostfixEvaluation {
	public static int calculate(int op1, char opr, int op2) {
		switch (opr) {
		case '+':
			return op1 + op2;
		case '-':
			return op1 - op2;
		case '*':
			return op1 * op2;
		case '/':
			return op1 / op2;
		case '%':
			return op1 % op2;
		}
		return 0;
	}

	public static int postfixEval(String postfix) {
		Stack st = new Stack(10);
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < postfix.length(); i++) {
			
			char ele = postfix.charAt(i);
			if (Character.isDigit(ele)) {
				str.append(ele);
			} else if (ele == ' ') {
				String s = str.toString();
				st.push(Integer.parseInt(s));
				str.delete(0, str.length());
			}
			// st.push(ele-'0');
			else {
				int op2 = st.pop();
				int op1 = st.pop();
				int res = calculate(op1, ele, op2);
				//System.out.println("result = "+res+"  "+i);
				st.push(res);
			}

		}
		if (!st.isEmpty())
			return st.pop();
		return 0;
	}

	public static void main(String[] args) {
		//String postfix = "45 69 *33 /8 +99 +70 -";
		String postfix="25 17 *13 /19 +17 -";
		
		System.out.println("Postfix : " + postfix);
		int result = postfixEval(postfix);
		System.out.println("Result : " + result);

	}
}
