package SDET2;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		//remove white spaces
		
		String str="adf agad hsud fhiou adgh";
		
		
		System.out.println(str.replaceAll(" ", ""));
		System.out.println(str.replaceAll("\\s", ""));
		
		
		
		
	}
}
