// AREA OF RECTANGLE USING SCANNER CLASS

package Assignments;
import java.util.Scanner;

public class Assignment_34 
{
   static Scanner s1=new Scanner(System.in); 
		   
	public static void main(String[] args) 
	{
		System.out.println("enter length");
		int l=s1.nextInt();
		
		System.out.println("enter breadth");
		int b=s1.nextInt();
		
		System.out.println("enter height");
		int h=s1.nextInt();
		
		
		double area= l*b*h;
		
		System.out.println("areaof rectangle is -->" +area);
       
	}

}
