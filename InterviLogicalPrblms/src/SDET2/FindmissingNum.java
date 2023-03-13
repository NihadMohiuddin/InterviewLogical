package SDET2;

public class FindmissingNum {

	
	
	public static void main(String[] args) {
		/*
		to find miss num logic is total sum of given array + last num in array sum
		
		*/
		int sum1=0;
		int[] a= {1,2,3,4,5,6,7,8,9,10,12};//46-55=9
		
		
		for (int i = 0; i < a.length; i++)
		{
			sum1=sum1+a[i];
			
			
		}
		
		System.out.println("Sum1 is "+sum1);
		
		
		
	               
		//shiuld start with index 1 becasue here we want total sum of last
		int sum2=0;
		for (int i = 1; i <= a[a.length-1]; i++)
		
		{
			
			sum2=sum2+i;
			
		}
		
		System.out.println("Sum2 is "+sum2);
	
		
		
		
		
		
		System.out.println("The missing num is  "+ (sum2-sum1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

	
	
	
	
	
	
	
	
}
