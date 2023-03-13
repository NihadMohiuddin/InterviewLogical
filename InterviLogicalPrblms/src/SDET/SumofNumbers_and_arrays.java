package SDET;

public class SumofNumbers_and_arrays {
/*
	public static void main(String[] args)
	{
		
		
		int num=6297524;
		int res=0;
		while(num>0) 
		{
			res=res+ num%10;//4
			
			num=num/10;
			
		}
		
		System.out.println(res);
		
		
}*/
//=================================================================



//sum of arrays
	public static void main(String[] args)
	{
		
		
		int[] a= {1,2,5,9,7};
		int res=0;
		
		for (int i = 0; i < a.length; i++) 
		{

			res+=a[i];//0+2=2   2+5=7   
			
			
			
		}
		
		System.out.println(res);
		
		
		
		
		
		
		
		
    }

/*  USING FOREACH LOOP
	public static void main(String[] args) {
		int[] a= {2,5,9,7};   //sum of array
		int res=0;
		int temp=1;  
		int data;
		
		for (int i : a) 
		{
			 
			res=res+1*i;//res=2
			
			
		}
		
		
		System.out.println(res);
		
		
		
		
		
		
	}
	*/

}