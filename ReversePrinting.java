package strings;

public class ReversePrinting 
{

	public static void main(String[] args) 
	{
	  String s= "nitino";
	  
	  String reverse="";
	  
	 for(int i=s.length()-1;i>=0;i--)
	 {
		 char c1=s.charAt(i);
		 
		 reverse=reverse+c1;
	 }
	  System.out.println(reverse);
	  
	  if(reverse.equals(s)) 
	  {
		  System.out.println("palindrome");			
		}
	  
	  else
	  {
		  System.out.println("not palindrome");	
	  }

	}
	

}
