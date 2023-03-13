package SDET;

import java.util.Iterator;

public class ReverseString {
/*
  //[stores in res] after loop completion final only prints res *not instantly excuting at console*
	public static void main(String[] args) 
	{
		String st="Asiya";
		String res = "";
		int l=st.length();
		 String r;
		//System.out.println(l);
		
		for (int i =l-1; i>=0; i--) 
		{
		
	     res=res+st.charAt(i);//if we dont use 2nd res, 'res' will be replaced 
		   
		
		}
	
		System.out.print(res);
		
	}

*/



public static void main(String[] args) 
{
	
	//=============================================================
	//executing at the same time in loop only but not after complteion pf loop
	
	String st="Asiya";
	String res = "";
	int l=st.length();
	
	for (int i =l-1; i >=0; i--)
	{
		char c=st.charAt(i);
		
		System.out.print(c);//printing instanlty one after other
		
		
		
	}
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
		
	
}