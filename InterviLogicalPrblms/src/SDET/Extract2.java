package SDET;

public class Extract2 {
	
	
	public static void main(String[] args) {
		
		
		
		
		String str="Showing 1 to 10 of 85 (6545 Pages)";
		 
		    
		    //System.out.println(str.indexOf('('));
		    
		    //System.out.println(str.indexOf('P'));
		    
		   int starting= str.indexOf('(');
		   int ending = str.indexOf('P');
		   //in substring as we know prints from starting index but starting index is '(' but we dont need '(' so added+1 i.e is next index after that index 
		    //index of p means what ever left having that prints
		   //-1 beacuse of space to remove space to left side of 'P'
		   str.substring(starting,ending);
		    System.out.println(str.substring(starting+1,ending-1));
		    
		    
		    
		    
		    
		}










/*


	public static void main(String[] args) {
		
		
		
		
		String str="Showing 1 to 5856 of 85 (6545 Pages)";
		 
		  //to find after 'to' 
		  int starting= str.indexOf('o',3);//or u can use 'to'
		  int ending = str.indexOf("of");
		  
		   
		//  System.out.println(str.indexOf('o',3));
		  // System.out.println(str.indexOf("of"));
		   
		    str.substring(starting,ending);
		  System.out.println(str.substring(starting+2,ending-1));
		    
		    
		    
		    
		    
		}



*/



/*

	public static void main(String[] args) {
		
		
		
String str =  "[order:,2;, flex: ,0, 0, calc((67878654592% - 1.69776px))]";

	
          int start= str.indexOf("((");
          int endin=str.indexOf("%");
        		  
        		  
//	System.out.println(str.indexOf("("));	 
	 
//	System.out.println(str.indexOf("%"));
		 
System.out.println(str.substring(start+2, endin));		 
		 

	
	
}



*/







}
