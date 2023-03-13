package SDET2;

import java.util.Iterator;

public class Equalityof2Array {


	
	public static void main(String[] args) {

		String[] s1={"why","took","mob","why","hi"};
		
		String[] s2={"why","took","mob","why","hhyi"};
		
		boolean equal=false;
		
			
			    
					
			    	 if (s1.length==s2.length) //first compare lenght beacuse if lenght differe waste for doing
			    	 
			    	 {
			    		 
			    		 for (int i = 0; i < s1.length; i++)
			    			{
							   if ( s1[i]==s2[i]) 
			    				 {
								   equal=true;
									
								 }
			    		 
							   else
							    {
								   equal=false;
								   break;
							     }
							 
			    			}
					 }
			    	 
			    	 
			    	 
			    	 
			    	 else 
			    	 {
			    		 equal=false;
			    		 System.out.println("SIZE NOT EQUAL");
			    		
				     }
			    	 
			    	 
			    	 
			    
			
			
		
		
		if (equal) 
		{
			 System.out.println("ARRAYS ARE EQUAL");
		} 
		
		else
		{
			 System.out.println("ARRAYS NOT EQUAL");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
