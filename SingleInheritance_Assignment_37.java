//Single level Inheritance using static and non-static methods

package inheritance;

class parent 
{
	static void add()    //static method of parent class
	{
		int a=22;
		int b=34;
		int sum=a+b;
		System.out.println(sum);
		
	}
        void sub()     //non-static method of parent class
        {
        	int a=60;
        	int b=70;
        	int sub=a-b;
        	System.out.println(sub);
         }


}
public class SingleInheritance_Assignment_37  extends parent  // Child class "SingleInheritance_Assignment_37" inheriting property of parent class by using extends keyword
{
	
	public static void main(String[] args) 
	{    SingleInheritance_Assignment_37 s1=new SingleInheritance_Assignment_37(); //create object of child class always
	
		add();
		s1.sub();
	}

}
