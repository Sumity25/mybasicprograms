package strings;

public class CharAtindex 
{

	public static void main(String[] args)
	{
		String s=  "mYcoUntry  ";
	    
		
		char a=s.charAt(1);
		
		System.out.println(a);
		
		int c=s.indexOf('r');
		
		System.out.println(c);
		
		String f= s.trim();
		System.out.println(s.trim());
		
		
		String e=s.substring(5,6);
		
		System.out.println(e);
		
		String w=s.substring(4);
		System.out.println(w);
		
		int l=s.length();
		System.out.println(l);
		
		String upper=s.toUpperCase();
		System.out.println(upper);
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.trim());
		System.out.println(s.substring(4));
		System.out.println(s.charAt(4));
		System.out.println(s.indexOf(c));
		
		
	}

}
