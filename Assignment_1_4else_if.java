package Assignments;

public class Assignment_1_4else_if 
{
    public static void main(String[] args) {
	    int marks=40;
	    
	    if(marks>= 90 & marks<100)
	
	     {
	       System.out.println("Congratulations for getting A++");
	     }
	    else if(marks>= 80 & marks<90)
	    {
		  System.out.println("GRADE A");
	    }
	
	   else if(marks>=70 & marks<80)
	    	
	     {
	       System.out.println("Grade B+");
	     }
	    
	    
	    else if(marks>=60 & marks<70)
	    	
	     {
	       System.out.println("Grade B");
	     }
	    else if(marks>=50 & marks<60)
	    	
	     {
	       System.out.println("Grade C");
	     }
	     
	    else 
	    {
		  System.out.println("Sorry result is fail");
	    }	        
	}
}