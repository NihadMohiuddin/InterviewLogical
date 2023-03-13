package SDET;

public class ReverseNum {
/*
	public static void main(String[] args)
	{
		
		
		int num=6297524;
		
		
		
		StringBuffer Sb=new StringBuffer(String.valueOf(num));
		//=Sb.reverse();
		
		System.out.println(Sb.reverse());
	
		
		
     }
*/
//==================================================================
	
	
	public static void main(String[] args)
	{
		int rev=0;
		int num=1234;//321
		//any num divide by 10 in remainder gives last digit
		//any num divide by 10 qutioent will be like deleting last digit
		while (num!=0)
		{               //
			rev=rev*10+num%10; // =4321 
			num=num/10; //0    to reduce or del last digit the digit 
			
		}
	
		System.out.println(rev);
		
		
		
		
		
		
     }

















}
