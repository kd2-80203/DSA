package com.sunbeam;

public class InfixtoPostfix {
	
	public static int prio(char opr) {
		switch(opr) {
		case '$': return 11;
		case '/': return 10;
		case '*': return 10;
		case '%': return 10;
		case '+': return 9;
		case '-': return 9;
		} 
		return 0;
	}
	public static  String infixtoPostfix (String infix) {
			Cstack st= new Cstack(10);
		 
			StringBuilder str= new StringBuilder();
			
			for(int i=0;i<infix.length();i++) {
				
				char ele= infix.charAt(i);
				
				if(Character.isDigit(ele)) {
					str.append(ele);
				}
				else if(ele=='(')
				{
					st.push(ele);
				}
				else if (ele==')') {
					while(st.peek()!='(') {
						str.append(st.pop());
					}
					st.pop();
					
				}
				else {
					while( !st.isEmpty() && prio(st.peek()) > prio(ele)) {
						str.append(" ");
						str.append(st.pop());
						
					}
					str.append(" ");
					st.push(ele);

				
				}
						
			}
			while(!st.isEmpty()) {
				str.append(st.pop());
				
			}
			return str.toString();
		
		
		
	}//19$34*682/+7+-+
	
	
	public static void main(String[] args )
	{
String infix = "11$9+33*44-(63+71/12)+72";
		
		System.out.println("Infix : " + infix);
		String postfix = infixtoPostfix(infix);
		System.out.println("Postfix : " + postfix);
	}

}
