package com.practice;

public class Practice_Swap {
	public void getSwap(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		
		
				
				
		System.out.println(a);
		System.out.println(b);
		
}
	
	public static void main(String[] args) {
		Practice_Swap obj = new Practice_Swap();
		obj.getSwap(20,30);
		
	}
	}


