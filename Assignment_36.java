//FIND % OPERATOR USING SCANNER CLASS

package Assignments;
import java.util.Scanner;
public class Assignment_36 
{
   static Scanner s1=new Scanner(System.in);
    
	public static void main(String[] args) 
	{
		System.out.println("enter value a");
        int a=s1.nextInt();
      
		System.out.println("enter value b");
        int b=s1.nextInt();
      
      
        double modulus =(a%b);
      
        System.out.println(modulus);

	}

}
