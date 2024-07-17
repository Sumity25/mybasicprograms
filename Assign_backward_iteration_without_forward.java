//Assignment 104- plesse use backward itertion without using forward iteration
package Collection;
import java.util.ArrayList;
import java.util.ListIterator;
public class Assign_backward_iteration_without_forward 
{

	public static void main(String[] args) 
	{
		ArrayList a2 =new ArrayList();
		a2.add("sudha");
		a2.add("vivek");
		a2.add("krishna");
		
		System.out.println(a2);
		
		ListIterator i2=a2.listIterator();
		
		
		
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
	}

}
