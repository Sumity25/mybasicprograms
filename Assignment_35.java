//AREA OF CIRCUMFERENCE OF CIRCLE USING SCANNER CLASS

package Assignments;
 
import java.util.Scanner;

public class Assignment_35 
{
   static Scanner s1=new Scanner(System.in);
   
	public static void main(String[] args) 
	
	{  System.out.println("enter radius");
		
	 double pi= Math.PI;
     int r=s1.nextInt();
     double area= 2*pi*r;
     System.out.println("circumference of circle->" +area);
		

	}

}
