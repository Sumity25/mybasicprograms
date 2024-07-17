//MULTI-LEVEL INHERITANCE USING STATIC AND NON-STATIC METHODS-Assignment 38

package inheritance;

class Mumbai

{   static void add()
	{
	int a=40;
	int b=30;
	int sum=a+b;
	System.out.println(sum);
	}
}

class delhi extends Mumbai
{
	void sub()
	{
		System.out.println("delhi is great");
		
	}

}
public class Multilevel_inheritance extends delhi
{

	public static void main(String[] args) 
	{
		
		add();
		
		Multilevel_inheritance m1=new Multilevel_inheritance();
		m1.sub();
	}

}
