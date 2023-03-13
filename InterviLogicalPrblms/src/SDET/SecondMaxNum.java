package SDET;

public class SecondMaxNum {
    
	
	public static void main(String[] args) {
	
    	   int[] a= {8,7,62,4,1,8,7,659};
            
    	     int firstmax=0;
             int Secondmax=0;
    
    	   
    	   for (int i = 0; i < a.length; i++)
    	   
    	    {
			       if (a[i]>firstmax)  //7>
			        {
			    	   Secondmax=firstmax;  //Secondmax=0   //if there is a value maxmim then firstmax ,  than assigmn pervious firstmax value to second max 
			    	   firstmax=a[i];      //firstmax=8
			     	} 
			       
			       
			       else if(a[i]>Secondmax)  //4>0
			       {

			    	   Secondmax=a[i]; //Secondmax=
				   }
    		   
    		   
    		   
    		   
    		   
	      	}
    	   
    	   System.out.println(Secondmax);
    	   
	}  
    	   
    	
	
	
/*
	public static void main(String[] args) {
		
		  int Max1;
		  int Max2;
	int[] a= {464,744,427,645458,8,645457,86,7565};
	
		
	
		if (a[0]>a[1]) 
		{
			Max1=a[0];
			Max2=a[1];
		}
		
		else 
		{
			 Max2=a[0];
		     Max1=a[1];

		}
	
	
	for (int i = 2; i < a.length; i++) 
	{
		
		if (a[i]>Max1) 
		{
			Max2=Max1;
			Max1=a[i];
		} 
		
		
		else if(a[i]>Max2)
		{
			Max2=a[i];
		}
		
		
		
	}

		System.out.println(Max2);
		
		
	}
	
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
