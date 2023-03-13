package SDET;

public class DuplicatesNumber {

	
	public static void main(String[] args) 
	{
		boolean nodupl=false;
		//find duplicates
		int[] a= {3,84,23,89,5,7,32};
		
		
		for (int i = 0; i < a.length; i++)//i=1
		{
			//here j=i+1 because we are comparing 3 with all and 84 with all to notcompare with same num we put +1 
			
			
			for(int j = i+1; j < a.length; j++) //j=2
			{
				
				if (a[i]==a[j]) //84==9
				{
					nodupl=true;
				}
				
				
				
			}
			
			
			
		}
		
		System.out.println("Duplic prsent "+nodupl);
		
		
	
	}
		
	

	
}
