package Collection;

import java.util.Collections;
import java.util.HashSet;


public class HashSet1 
{

	public static void main(String[] args)
	{
		HashSet a1=new HashSet();
		a1.add(50);
		a1.add(20);
		a1.add(30);
		a1.add(10);//duplicate
		
		a1.add(null);
		a1.add("ekta");
		
		//Collections.sort(a1);
		System.out.println(a1);

	}

}
