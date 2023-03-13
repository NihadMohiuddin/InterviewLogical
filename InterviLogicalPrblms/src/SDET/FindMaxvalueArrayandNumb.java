package SDET;

import java.util.Iterator;

public class FindMaxvalueArrayandNumb {

	/*
	public static void main(String[] args) {
		
		
		
		//to find max value from array
		int[] a= {563,9,56,65};
		int Max=a[0];
	
		
		
		for (int i =0; i < a.length; i++)
		{
			
		  
			if (a[i]>Max)  	//if a[i] value is always bigfrom max then put in max
		   {
		 	   Max=a[i];
		  
		   } 
				}
		
		System.out.println("Max value is "+Max);
		
		
		
		//int[] a= {2,9,4,4};
		int Min=a[0];
		for (int r =0; r < a.length; r++)
		{
			
			if (a[r]<Min)
		    {
			  Min=a[r];
		    } 
		
		
	  }
	
		System.out.println("Min value is "+Min);
		
	}	

*/




	public static void main(String[] args)
	{
		
			int a=10,b=60,c=5;
			
		if (a>b && a>c) 
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c) 
		{
			System.out.println("b is greater");
		}
		
		else if (c>a && c>b) 
		{
			System.out.println("c is greater");
		}
		
		
		
	}
	
/*
public static void main(String[] args) {
		
		int num=55855;
		int Max=0;
		int res;
		while (num!=0)
		{
			
			   res=num%10;//8
		     
			   if (res>Max)
			   {
			         Max=res;//Max=9
		        }
			   
			
			   num=num/10; //num=56545789
			
		}
		
		
		
	  System.out.println(Max);

}

*/







}
