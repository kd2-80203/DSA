package com.sunbeam;

public class Cstack {
	
		private char arr[];
		private int top;
		private final int SIZE;
		public Cstack(int size) {
			SIZE = size;
			arr = new char[SIZE];
			top = -1;
		}
		
		public void push(char data) {
			if(!isFull()) {
			//a. reposition the top
			top++;
			//b. add data at top index
			arr[top] = data;
			}
			else 
				System.out.println("Stack is full");
		}
		
		public char pop() {
			if(!isEmpty()) {
			//a. read data from top index
			char data = arr[top];
			
			//b. reposition top
			top--;
			return data;
			}
			//c. return read data
			return 0;
		}
		
		public char peek() {
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







