package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Backward_iteration 
{

	public static void main(String[] args) 
	{
		
  ArrayList a1= new ArrayList();
  a1.add("Rahjan");
  a1.add("ekta");
  a1.add("sumit");
  
  System.out.println(a1);
  
  Iterator i1=a1.iterator(); //using iterator
  
  while(i1.hasNext())
  {
	  System.out.println(i1.next());
  }
  
  ListIterator i2=a1.listIterator();  //using listiterator
  while(i2.hasNext())
  {
	  System.out.println(i2.next());
  }
  
  System.out.println("|||||||||||||");  
  
  while(i2.hasPrevious())
  {
	  System.out.println(i2.previous());
}
}

}
