package SDET;

public class AddingSpacesinString {
	
	
	
	public static void main(String argvs[])  
	{  
	  
	// input string  
	String str = "JavaTpoint";  
	
	  
	String c = "";  
	// adding a white space before and after every character of the input string.  
	str = str.replaceAll(c, " ");  
	  
	System.out.println(str);  
	  
	}  
}
