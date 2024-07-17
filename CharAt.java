//charAt(), indexofchar(''),trim

package Stringfunctions;

public class CharAt 
{

	public static void main(String[] args)
	{
	   String a= "I love my India" ;
	   char first =a.charAt(8);
	   
	   System.out.println(first);
          
	   String b="madam";
	   char u = b.charAt(0);
	   System.out.println(u);
	   
	  int c= a.indexOf('m');
	  
	  System.out.println(c);
	   
	  String trimmed=a.trim();
	  System.out.println(trimmed);
	  
	  System.out.println(b);
	  String s=b.trim();
	  System.out.println(b.trim());
	  
	  String m="madam";
	  String f=m.substring(3);
	  System.out.println(f);
	  
	  String input="manish kumar tiwari";
	  String d=input.substring(7,12);
	  System.out.println(d);
	  
	  String name="My name is Anusha Channa";
	  String name1=name.toUpperCase();
	  System.out.println(name1);
	  
	  boolean t=m.equals(b);
	  System.out.println(t);
	  
	  if(t==true)
	  {
		  System.out.println("it is palindrome");
	  }
	  else
	  {
		  System.out.println("it is not palindrome");
	  }
	}

}
