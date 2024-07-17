//WAP ON COMBINATION OF METHOD OVERLOADING & CONSTRUCTOR OVERLOADING

package Assignments;
 
public class Assignment_15
{

	Assignment_15 ()
	{
		System.out.println("constructor1");
		
	}
	
	Assignment_15(int a)
	{
	   System.out.println("constructor2");
	   
	}
	
	void add() 
	{
		System.out.println("non-static method1");
	}
	
	void add(int a)
	{
		System.out.println("non-static method2");
	}
	
	static void add(int a,int b)
	{
		System.out.println("static method1");
	}
	
	static void add(double a)
	{
		System.out.println("static method2");
	}
	
	public static void main(String[] args) 
	{
		
		Assignment_15 a1=new Assignment_15 ();
		Assignment_15 a2=new Assignment_15 (23);
		
		
		a1.add();
		a1.add(4);
		
		add(12,34);
		add(567.9);
		
	}

}
