package Collection;
//BY CREATING OBJECT OF VECTOR CLASS

import java.util.Collections;
import java.util.Vector;
public class Vector_add
{

	public static void main(String[] args) 
	{  
		  Vector a1=new Vector();
		
           a1.add(80);
           a1.add(20);
           a1.add(30);    
           a1.add(40);
           a1.add(50);	
	
	   //duplicate value
	
	      a1.add(80);
	      a1.add(80);
	
	//null value
	      
	       //a1.add(null);
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

