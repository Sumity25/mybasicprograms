package try_catch;


public class Throw 
{

	public static void main(String[] args) 
	{
		try
		{
			int a=4/0;
			System.out.println(a);
		}
		
		catch(ArithmeticException a1)
		{
			System.out.println("handled the exception");
		}
		
	}

}