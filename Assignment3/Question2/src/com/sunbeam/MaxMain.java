package com.sunbeam;

public class MaxMain {
	public static void main(String[] args ) {
		
		Stack st= new Stack(5);
		st.push(10);
		st.push(5);
		st.push(11);
		st.push(6);
		st.push(9);
		System.out.println("MAX Element is "+st.getMax());
	}

}
