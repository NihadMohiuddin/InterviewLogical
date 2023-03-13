package SDET2;

public class CountofoccuranceCharinString {

	
	

	public static void main(String[] args) {
		
		//firstly find total length and replace your char to "" empty and thn find the length
		String str="mohiddin";
		
		int lengthbefore=str.length();
	    //remove the required letter
		String s=str.replace("d", "");  //mohiin
		System.out.println(s);
		int lengthAfter=s.length();
		
		
		System.out.println("Total count of occurence of the given letter is "+(lengthbefore-lengthAfter));
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
