package com.Exercise101Subprogramas.app;


import java.util.Scanner;

public class SubProgramas {

	public static void main(String[] args) {
		
		//Variables declaration
		
		int num1=0;
		int num2=0;
		int result=0;
		
		
		//Objects declaration
		
		Scanner input = new Scanner(System.in);
		
				
		System.out.println(ShowTunnedMessage("Ale"));
		
		ShowMessage();
		
		
		
		System.out.println("Dame un numero");
		
		num1 = input.nextInt();
		
		System.out.println("Dame otro numero");
		num2 = input.nextInt();

		
		result = num1+num2;
		
		System.out.println("Result is:"+result);
		
		}
	
		//Method to ask numbers
	
		public static void ShowMessage()
		{
			System.out.println("input a number");
		}
	
		public static String ShowMessage(String message)
		{
			return "hola"+message;
		}
	
		//Method to show a tuned message
		
		public static String ShowTunnedMessage(String message)
		{
			return "Hola"+message;
		}
		
		//Method to add numbers
		public int AddNumeros(int num1, int num2)
		{
			return num1+num2;
		}
		
		

}
