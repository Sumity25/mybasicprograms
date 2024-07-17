//use of super calling statement to call non para constructor

package Assignments;

class Class2 extends Class1
{
   Class2(int age)  //constructor with para
   {
	   System.out.println("bad");
   }
}

  class Class4 extends Class2
 {
	 Class4() //constructor 
	 {    super(8);
		 System.out.println("nice");
	 }
	
 }
  
  class Class1 
  {
     Class1() //constructor
     {super();
  	   System.out.println("good");
     }
  
	 public static void main(String[] args)
	 {
		 Class4 c=new Class4();
	 }
 
  }
  