package com;

public class Main {

	static int i;
	
	
	
	public static void main(String[] args) {
		 
		System.out.print("Current time is");
		System.out.println(ShowTime.show());
		
	try { i = 5/0; } catch(Exception e) {
	         if (e instanceof ArithmeticException) {  System.out.println(e); }
	}

		System.out.println("Commit Record_");
	
	}

}
