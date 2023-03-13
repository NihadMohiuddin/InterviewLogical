package SDET2;

public class RemoveJunk {
	
	
	static String junkstring="(*^&^&%SELNIUM %^$%^@#$#^$786dfsdfhdgjfhj^&&*()(()?>:{P+|{a}{pS{PD{";
	
	public static void main(String[] args) 
	{
		
		
		
		//^ means  excluding
		String updatestring=junkstring.replaceAll("[^a-zA-Z]", "");
		System.out.println(updatestring);
		
	}


}
