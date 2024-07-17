// WAP TO DECLARE AND INITIALISE METHODS OF SCANNER CLASS
package Assignments;

import java.util.Scanner;  

public class Assignment_33
{
	
	
	static Scanner s1= new Scanner(System.in);  //SYNTAX OF SCANNER CLASS
	
	
	public static void main(String[] args) 
	
	{    System.out.println("enter integer value");
		int a=s1.nextInt();  //CALLING INT METHOD OF SCANNER CLASS
		
		System.out.println("enter string value");
		String b=s1.next();   //CALLING STRING METHOD OF SCANNER CLASS
		
	    System.out.println("enter short value");
		short c=s1.nextShort();    ////CALLING SHORT METHOD OF SCANNER CLASS   AND SO ON...
		 
	    System.out.println("enter long value");
		long l=s1.nextLong();
		
	    System.out.println("enter boolean value");
		boolean b1=s1.nextBoolean();
		
	    System.out.println("enter float value");
		float f=s1.nextFloat();
		
		 System.out.println("enter double value");
		double u=s1.nextDouble();
		
	   	System.out.println("enter byte value");
		byte h=s1.nextByte();

	}

}
