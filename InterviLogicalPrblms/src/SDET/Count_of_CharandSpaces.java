package SDET;

import java.io.IOException;

public class Count_of_CharandSpaces {

	/*
	public static void main(String[] args) {

	    String str="Nihad mohiddin";    //count of chars in string
	    int count=0;
	 
		
	    
	    for (int i = 0; i < str.length(); i++) 
		{
			
	   	 char  blankspac=' ';
		
		     	if (str.charAt(i)!=blankspac) 
			    {
		     		
		     		count++;
				
			    } 
			
			
		}
	
	           System.out.println(count);
	
	
	}
	
	*/
public static void main(String[] args) {
	
	
String str="mohiuddin nihad sgfsfg";//find count of characteras
	
	
	String[] word=str.split(" ");
	
	
	int res=0;
	for (int i = 0; i < word.length; i++) 
	{
		
		
	 res+=word[i].length();
		

	
	}
	System.out.println(res);
}


	
        /*
	public static void main(String[] args) throws IOException {
		
		   String str="Nihad mohiddin";
		
		String s=str.replaceAll(" ", "");
		
		
		System.out.println(s.length());
		
	}
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
}
