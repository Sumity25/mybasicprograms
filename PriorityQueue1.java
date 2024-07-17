package Collection;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue1
{

	public static void main(String[] args) 
	{
		PriorityQueue a1=new PriorityQueue();
		a1.add(50);
		a1.add(20);
		a1.add(0); //duplicate 
		a1.add(70);
		
		//a1.add(null); 
		//a1.add("ekta");
	
		//Collections.sort(a1);
		System.out.println(a1);

	}

}
