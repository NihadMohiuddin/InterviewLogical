package SDET2;

public class ReplceString {

	
	/*
	public static void main(String[] args) {
		
		
		String str="Nihad";   //0,2,4
		String ff="";
		
			
			 ff=str.replace("i","0").replace("a", "0");
		
		
		System.out.println(ff);
		
	}
	
	*/
	



public static void main(String[] args) 
{
    
	
	String str="Nihad";//0,2,4,6
	
//	char c='0';
	
	StringBuilder buff=new StringBuilder (str);

	
	for (int i = 1; i <str.length(); i++)
    {
		

	
		buff.setCharAt(i,'0');
		i=i+1;
	
		
			
		
	}
	
	System.out.println(buff);
	

	
	
	
}	
	
}