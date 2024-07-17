package Collection;

import java.util.LinkedList;
import java.util.Collections;

public class Linkedlist1
{

	public static void main(String[] args) 
	{  
		LinkedList a1=new LinkedList();
		
           a1.add(80);
           a1.add(20);
           a1.add(30);    
           a1.add(40);
           a1.add(50);	
	
	   //duplicate value
	
	      a1.add(80);
	      a1.add(80);
	
	//null value
	      
	      // a1.add(null);
		    //a1.add(null);
	       //a1.add(null);
	
	//heterogenous value
       	
	 // a1.add("ekta");
	//   a1.add("sumit");
	 //  a1.add("vivek");
	   
	  Collections.sort(a1);
	 System.out.println(a1);
	 
	}
}

