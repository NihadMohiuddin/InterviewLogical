package SDET;

public class ExtarctFromString {
	public static void main(String[] args) 
	{
		

       
        String str =  "[order:,2;, flex: ,0, 0, calc((56.592% - 1.69776px))]";
        String[] arr = str.split(",");
        
    System.out.println(arr);
        
  
        for(int i=0;i<str.length();i++) 
        {
                if (arr[i].contains("calc((56.592% - 1.69776px))]")) 
                {
                	String[] a=arr[i].split("%");
			System.out.println(a.length);
                	String s=a[0].replace("calc((", "").replace("%", "");
              System.out.println(s);
                } 
               
                
                
                
                
                
        	//boolean r=arr[i].contains("calc((56.592% - 1.69776px))");
        	
     //	System.out.println(r);
        	
        
        }
      
	
	
	
	}
		
//=========================================================
/*
public static void main(String[] args) {
		
		
		String str =  "[order:,2;, flex: ,0, 0, calc((56.592% - 1.69776px))]";
		
		String upodat=str.replaceAll("[a-z(())%]", "");
	
		System.out.println(upodat);        //[:,2;, : ,0, 0, 56.592 - 1.69776]
		
		
		String[] array=upodat.split(" ");
		
		for (String string : array) 
		
		{
			if (string.contains("56.592")) 
			{
				System.out.println(string);
			}
			
		
			
			
	
	
		}
		
		
	
		
		
		
		
		
	  

}
	

		*/
}
