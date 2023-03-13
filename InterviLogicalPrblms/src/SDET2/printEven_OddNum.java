package SDET2;

public class printEven_OddNum {

	
	/*   Using i++ incrment 
	public static void main(String[] args) {
		
		for (int i = 0; i <=10; i++)// Expected 0,2,4 
		{
			System.out.println(i);//0
		   
		     i=i+1;
		}
		
	}
	
	*/

	
	
	/*   Using i++ incrment 
	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++)// Expected 1,3,5
		{
			System.out.println(i);//1
		   
		     i=i+1;
		}
		
	}
	*/
	
	
	/*
public static void main(String[] args) {
		
		for (int i = 1; i <=10; )// Expected 1,3,5 without i++
		{
			System.out.println(i);//1
		   
		     i=i+2;
		}
		
	}

*/

public static void main(String[] args) {
	
	for (int i = 2; i <=10; )// Expected 2,4,6 without i++
	{
		System.out.println(i);//2
	   
	     i=i+2;
	}
	
}


}
