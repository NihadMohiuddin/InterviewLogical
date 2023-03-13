package SDET;

public class Palindrome {

	
	/*
	public static void main(String[] args) {
		
		//paliondrome
		int num=9889;
		int givennum=num;//ghere two varib beacuse after the while loop completes num value changes
		int res=0;
		
		while (num!=0) 
		
		{

			res=res*10+num%10;//40+5=4
			num=num/10;//4565
			

		}
		
		
		if (res==givennum) 
		{
			System.out.println("the given num is PALINDROME");
		}
		else
		{
			System.out.println("the given num is NOT  PALINDROME");
		}
		
		
	*/
		
	//=================================================================	
		
	


   //with STRING

 public static void main(String[] args) {
	
	
	String res="";
	String str="AOOA";
	String origstr=str;
	
	for (int i = str.length()-1; i>=0; i--)
	{
		res=res+str.charAt(i);//
	
	
	
	}
	
	
	if (res.equals(origstr)) 
	{
		System.out.println("String is PLAINDROME");
	}
	
	else
	{
		System.out.println("String is  NOT PLAINDROME");
		}
	}
	
	
	
	
	
	
	
	
}











	
	
	
	
	
	
	
	
	
	
	
