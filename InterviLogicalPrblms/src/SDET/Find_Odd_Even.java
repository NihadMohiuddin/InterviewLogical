package SDET;

import java.util.Iterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Find_Odd_Even {
	//to find present or not
	//if used boolean at FIRST "DONT USE ELSE ,ONLY USE IF " beacuse value varies with else
	public static void main(String[] args)
	{
	/*	
		
		 * 
		int[] a= {4,8445,3287};
		boolean present=false;
	for(int i=0;i<a.length;i++) 
	{
		int Int=a[i];
		
		if (a[i]%2==0)
		{
			present=true;
		} 
		
		
		
	}
	   System.out.println(" Even present "+present);	
		
	}
*/
	
	
		
		
		
	
//======================================================================	
	
		/*
	//For count of vowels and odd
	
	
	int[] a= {0,98,543,78,655};
	int countofeven=0;
	int countofodd=0;
	
	
	for(int i=0;i<a.length;i++) 
	{
		
		
		if (a[i]%2==0) 
		{
			countofeven++;
	    }
		

		else
		{
			countofodd++;
				
		}
	

	}
	
	
	System.out.println("Even count "+ countofeven +" Odd count "+ countofodd );
	
	
	
	*/
	
		
//===================================================================	
		
		//print odd and even
		
		
		int[] a= {2,1,9,3,8,5,63,84};
		
		int total=a.length;
		
		
		String s = ",";
		System.out.println("Even num are");
	
		//forloop  for even numb 
		for (int i =0; i<a.length; i++) 
		{
			
			
				if (a[i]%2==0) 
				{   
					System.out.print(a[i]+",");
				
				} 
				
				
			
			
			
		}
		
				
		//forloop   for odd numb 
		System.out.println();
		System.out.println("Odd number are");
		for (int i = 0; i < a.length; i++) 
		{
			
					if (a[i]%2!= 0)//single equals
					{
						System.out.print(a[i]+",");
					}
			
		}
		
		
		
		
	}	
	
}
