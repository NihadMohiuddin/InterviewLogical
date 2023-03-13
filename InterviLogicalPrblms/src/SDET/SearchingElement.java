package SDET;

public class SearchingElement {

	
	public static void main(String[] args) {
		
		
		int[] a= {5356,784,264,54894,165,85,4};
		boolean flag=false;
		int Search=4;
		
		for (int i = 0; i < a.length; i++) 
		{
			
					if (a[i]==Search) 
					{
                      
						System.out.println("ELEMENT FOUND at index num "+ i );
						flag=true;
						break;
					}
		        
	        	  
			
			
		}
		
		if (flag==false)
		{
			System.out.println("ELEMENT NOT FOUND");
		} 
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
