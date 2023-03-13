package SDET2;

public class ReverseWordinString {

	public static void main(String[] args) {
		
		
		
		String str="baboo nihad samsung";


        String[] words=   str.split(" ");
         String Reversestring="";
       	
         for (String eachword : words)
       {
      	 
      	   String rev="";//this should be inside loop
      	 for (int i = eachword.length()-1; i>=0; i--)
      	 {
      		    
      		 rev=rev+eachword.charAt(i);
			  
      	 
      	 
      	 }
      	 
      	
      	 Reversestring=Reversestring+rev+" ";
      	 
		 }

System.out.println(Reversestring);


}









/*

	public static void main(String[] args) {
		
		
	       String str="nihad mohiddin";
			
			
			String[] word=str.split(" ");
			
			    
			     String  Stringrev="";
			
		    for (int i = 0; i < word.length; i++) 
			{
				
		    	   String wordrev="";//this should be inside for loop
				for(int j = word[i].length()-1; j >= 0; j--)
				{
					
					 wordrev= wordrev+word[i].charAt(j);
				
				
				}
				
				
			      Stringrev=Stringrev+wordrev+" "; //Stringrev=dahin
				
				    
				
			}
			
		       System.out.println(Stringrev);
			
			
			
			
			
		}



*/













}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
