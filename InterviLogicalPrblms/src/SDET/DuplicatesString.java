package SDET;

import java.util.Iterator;

public class DuplicatesString {

	
	
	public static void main(String[] args) {
		
		String[]a= {"JAVA","PYTHON","RUBY","RUBY"};
		
		boolean flag=false;
		for (int i = 0; i < a.length; i++) 
		{
			    for (int j = i+1; j < a.length; j++) 
			   {
				 	
			    	if (a[i]==a[j])
			    	{
			    		System.out.println("Duplicate FOUND at index no "+ i);
				        flag=true;
			    	} 
			    	
			    	
			    	
			   }
		
		
		
		}
		
		
		if (flag) 
		{

			//System.out.println("Duplicate FOUND  ");
		}
		else
		{
			System.out.println("Duplicate NOT FOUND"  );
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
