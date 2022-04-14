package com.wipro.fundamentals;
import java.util.Scanner;
public class Test {
	public  static void main(String[] abc) {
		// local variable-> declare inside the method or block
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		if(num%2 == 0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
		System.out.println("---------------------------------");
		System.out.println("Enter first number : ");
		int num1=sc.nextInt();
		System.out.println("Enter second number ; ");
		int num2=sc.nextInt();
		if(num1 > num2)
			System.out.println(num1+" is greater than "+num2);
		else
			System.out.println(num2+" is greater than "+num1);
		System.out.println("=================================");
		System.out.println("Enter third number ");
		int num3=sc.nextInt();
	/*	if(num1>num2 && num1>num3) {
			System.out.println(num1+" is Greater");
		} 
		else if(num2>num3)
			System.out.println(num2+" is Greater");
		else
			System.out.println(num3+ " is Greater");  */ 
    	int temp=num1>num2?num1:num2;
    	int largest=num3>temp?num3:temp;
	    System.out.println("Greates of three number is "+largest);
	    System.out.println("============================");
		
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
			System.out.println(ch+" is Upper Case");
		else if(ch>='a' && ch<='z')
			System.out.println(ch + " is Lower Case");
		else
			System.out.println("Not a letter");
		
		
	}

}
