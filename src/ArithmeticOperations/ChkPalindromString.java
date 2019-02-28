

package ArithmeticOperations;

import java.util.Scanner;


public class ChkPalindromString 

{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		String str, revStr="" ;
		
		
		Scanner Scobj=new Scanner(System.in);
		
		System.out.println("enter the string to check:");
		
		str=Scobj.nextLine();
		
		int len=str.length();
		
		for (int i=len-1;i>=0;i--)
		{
			revStr=revStr+ str.charAt(i);
			
			//System.out.print(revStr);
		}
		
		if (str.equals(revStr))
				System.out.println("String is palindrome");
		else
				System.out.println("not palindrome");
					
		
		
		

	}

}
