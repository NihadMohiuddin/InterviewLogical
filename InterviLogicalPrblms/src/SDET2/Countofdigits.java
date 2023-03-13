package SDET2;

public class Countofdigits {
	
	public static void main(String[] args) {
		
		
		int num=5656212;
		
		int count=0;
		
	
		while (num!=0)
		
		{
            num=num/10;   //   '/' cuts or deletes
            count++;
             
		}
		
		System.out.println(count);
		
		
		
		
	}
}
