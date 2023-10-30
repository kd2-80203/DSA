package com.sunbeam;

public class ReverseMain {
	
	public static void main(String[] args )
	{
		int arr[]= {10,20,30,40,50,60};
		Stack st= new Stack(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			st.push(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=st.pop();
		}
		
		
		//display reversed array
		for(int e:arr)
			System.out.print(e+" ");
	}

}
