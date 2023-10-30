package com.sunbeam;

public class Stack {
	private int arr[];
	private int top;
	private final int SIZE;
	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}
	
	public void push(int data) {
		if(!isFull()) {
		//a. reposition the top
		top++;
		//b. add data at top index
		arr[top] = data;
		}
		else 
			System.out.println("Stack is full");
	}
	
	public int pop() {
		if(!isEmpty()) {
		//a. read data from top index
		int data = arr[top];
		
		//b. reposition top
		top--;
		return data;
		}
		//c. return read data
		return 0;
	}
	
	public int peek() {
		if(!isEmpty()) {
		//a. read/return data of top index
		return arr[top];
		}
		return 0;
		
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE -1;
	}

}




