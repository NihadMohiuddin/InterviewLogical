package SDET2;

import java.util.Iterator;

public class FindRepeatedChars {

	
	
	static String str="mohiddin";
	
	
	
	public static void main(String[] args) {
		
		int count=0;
		for (int i = 0; i < str.length(); i++)
		{
			
			
			for (int j = i+1; j < str.length(); j++)
			{	
				  if (str.charAt(i)==str.charAt(j))
				  {
					System.out.println("Repeated char is "+str.charAt(i));
				     count++;
				  }
				
				
			}
		}
		
		
		System.out.println(count);
	
	
		
		
		
		
	
	}
	
	
	
	
	
	
	
}
