package com.sunbeam;

public class PrefixEvaluation {
	
	
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
	
	public static int prefixEval(String prefix) {
		
		Stack st= new Stack(10);
		StringBuilder str= new StringBuilder();
		//System.out.println("Prefix length"+prefix.length());
		for(int i=prefix.length()-1;i>=0;i--) {
			
			char ele=prefix.charAt(i);
			if(Character.isDigit(ele)) {
				str.append(ele);
			}
			else if(ele==' ') {
				str.reverse();
				String s=str.toString();
				
				//System.out.println("String =  "+s);
				st.push(Integer.parseInt(s));
				str.delete(0, str.length());
										//-++ 42/*25 16 13 19 37
			}
			else {
				int op1=st.pop();
				int op2=st.pop();
				int result= calculate(op1, ele, op2);
				//System.out.println("Result = "+result);
				st.push(result);
			}
				
			
			
		}
		if(!st.isEmpty()) {
			return st.pop();
		}
		return 0;
	}
	
	public static void main (String []args) {
		
String prefix = "-++ 42/* 25 16 13 19 37";
		
		System.out.println("Prefix : " + prefix);
		int result = prefixEval(prefix);
		System.out.println("Result : " + result);
	}
	

}
