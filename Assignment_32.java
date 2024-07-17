// WAP USING SCANNER CLASS STATIC AND NON-STATIC- DO ADDN,SUBT,MULTIP,DIVISION AND MODULUS OF 4 DIFF METHODS.
package Assignments;

import java.util.Scanner;

public class Assignment_32
{
	static Scanner s1=new Scanner(System.in);
	 
	
	 void add()
	
	{   
		System.out.println("enter value of a &b to add");
		double a=s1.nextDouble();
		double b=s1.nextDouble();
		double sum=a+b;

	System.out.println(sum);
		
	}

	 static void sub()
	{      System.out.println("enter value of a &b to sub");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int sub=a-b;
		
	System.out.println(sub);
		
	}

	static void multip()
	{      System.out.println("enter value of a &b to multip");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int multip=a*b;
		
	System.out.println(multip);
		
	}
	static void div()
	{      System.out.println("enter value of a &b to divide");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int div=a/b;
		
	System.out.println(div);
		
	}

	static void modulus()
	{      System.out.println("enter value of a &b to modulus");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int modulus=a%b;
		
	System.out.println(modulus);
		
	}

	
public static void main(String[] args)
{   
Assignment_32 a1= new Assignment_32();

  a1.add();
	sub();
	multip();
	div();
	modulus();
	
	
}
}





