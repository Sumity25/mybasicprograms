package try_catch;
import java.util.InputMismatchException;

public class TrycatchException2 {

	public static void main(String[] args) {
		
		int rollno[]=new int[3];  //size 3  
		
		rollno[0]=15;
		rollno[1]=19;
		rollno[2]=20;
		rollno[3]=40;
		
		try
		{
			 rollno[1]=19;
		}
		catch(ArrayIndexOutOfBoundsException a)
		
		{
			System.out.println("size is more");
		}
		
	}

}
