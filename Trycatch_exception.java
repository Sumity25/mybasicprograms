//Assignment- try and catch block to enter age,salary,weight and are you student?

package try_catch;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Trycatch_exception 
{   
     
   
	public static void main(String[] args)
  {
	    try 
	   {  Scanner s1=new Scanner(System.in);
	   
		 System.out.println("enter valid age");
		 int age=s1.nextInt();
		 
		 System.out.println("enter valid salary");
		 double salary=s1.nextDouble();
		 
		 System.out.println("enter valid weight");
		 float weight=s1.nextFloat();
		 
		 System.out.println("are you student");
		 boolean are_you_student=s1.nextBoolean();
		 
	    }
	 
	    catch(InputMismatchException I)
	    {
	    	Scanner s1=new Scanner(System.in);
	 	   
			 System.out.println("enter valid age");
			 int age=s1.nextInt();
			 
			 System.out.println("enter valid salary");
			 double salary=s1.nextDouble();
			 
			 System.out.println("enter valid weight");
			 float weight=s1.nextFloat();
			 
			 System.out.println("are you student");
			 boolean are_you_student=s1.nextBoolean();
			 
		 
		     
	     }
	       
	    
		
	}

}
 