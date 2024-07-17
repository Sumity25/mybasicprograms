//CONSTRUCTOR CALLING WITH PARA AND NON-PARA
package Assignments;

public class Constructor_calling_Assignment_14
{        
     
	  Constructor_calling_Assignment_14()  //CONSTRUCTOR NAME SAME AS CLASS NAME
	 {
		 System.out.println("i am great");
	 }
	 
	  Constructor_calling_Assignment_14(int a)
	 {
		 System.out.println("India is great");
	 }
	  
	  Constructor_calling_Assignment_14(int a,int b)
	  {
			 System.out.println("england");
		 }
		  
	  Constructor_calling_Assignment_14(String s)
	  {
			 System.out.println("string");
	 }
	  
	
		  
	public static void main(String[] args) 
	{

		 Constructor_calling_Assignment_14 c1=  new  Constructor_calling_Assignment_14();  //CALLING NON-PARA CONSTRUCTOR 
		 
		 Constructor_calling_Assignment_14 c2= new  Constructor_calling_Assignment_14("hh"); // CALLING PARA CONSTRUCTOR
		   
	}     

}
