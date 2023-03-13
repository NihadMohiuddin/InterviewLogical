package SDET;

public class Vowels {

	//if used boolean at FIRST "DONT USE ELSE ,ONLY USE IF " beacuse value varies with else
	public static void main(String[] args) 

	{
		/*to find vowels presnt or not
		String s="sssfsfsf";
		
		boolean isprestn =false;
		for (int i = 0; i <s.length(); i++)
			
		{
			char c=s.charAt(i);
			
			if (c=='a'||c=='e'||c=='i'||c=='o')
			{
				isprestn=true;
			    break;
			}
	  
			
							
		
		}
		
	if (isprestn) 
	{
		System.out.println("vowels present");
	} 
	else
	{
		System.out.println("vowels NOT present");
	}
	*/
	
//======================================================
	
	//count of vowles
	String s="aaaaa";
	
	int total=s.length();
	
		int count=0;
		 char c;
	      for (int i = 0; i < total; i++)
	      {
	    	 
	    	  c=s.charAt(i);
	    	 
	    	  if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') 
	    	  {
	    		  count++;
			   } 
	    	  
		    }
	    
	      System.out.println(count);
	
	
	
	
	}
	
	
	
	
	
	
	
}
