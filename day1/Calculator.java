package day1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("°è»ê±â");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		int c = sc.nextInt();
		
		int result =0;
		
		if (b.equals("+")) {result = a + c;}
		if (b.equals("-")) {result = a - c;}	
		if (b.equals("*")) {result = a * c;}
		if (b.equals("/")) {result = a / c;}
		
		System.out.println(a + b + c +"="+result);
		
		
	}
		
		
				
				
				
	
	}
