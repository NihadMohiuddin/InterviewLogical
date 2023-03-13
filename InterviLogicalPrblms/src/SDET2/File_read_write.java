package SDET2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class File_read_write {
public static void main(String[] args) throws IOException {
		
		//for Folder creation use mkdir() not createfile() for folder
		
		//in object give "path +folder name/file name"
		
	/*
		File folder=new File("C://aaadacdaxxzaa");
		if(folder.mkdir()) {
			System.out.println("folder created");
		}
			else {
				System.out.println("error occured");
			
			
		}
		*/
	//-----------------------------------------------------------------	
		//for file creation in folder
		//NOTE for file creation first give folder name or create folder first and give file location
	//for file put .txt, for photo put .png it automatically creates ordinary file or photo file
	
		/*
		
		File file=new File("C://rrrr//ffff.png");
		
		if(file.createNewFile()) {
     System.out.println("file created");
	}
		else {
			System.out.println("file creation failed");
			
		}
	*/
	//----------------------------------------------------
	// for writing file
	/*	
	FileWriter write=new FileWriter("C://rrrr//filename.txt");
	
	write.write("browser=firefox");
	
	//after opening book u close roght same way close the folder
	System.out.println("done");
	write.close();
	*/
	//-------------------------------------------------
	
	
	
	//for reading file using properties
	/*
	FileReader fr=new FileReader("C://rrrr//filename.txt");
	Properties pr=new Properties();
	pr.load(fr);
	//give key as attribut name and it returns the value of key (browser=chrome )
	System.out.println(pr.getProperty("browser"));
	
	*/
	//-------------------------------------------------
	
	
	//for reading file usse both filereader and buffereeader
	String path="C:\\Users\\Ya Rahman\\eclipse-workspace\\InterviLogicalPrblms\\src\\SDET2\\text.txt";
	
	FileReader fr=new FileReader(path);
	BufferedReader bfr=new BufferedReader(fr);
	
	//realine reads only one line not all lines in text file to read all use whileloop
	String str = bfr.readLine();
	
	
	while (str!=null) 
	{
	
		System.out.println(str);
		str = bfr.readLine();
	}
	
	bfr.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}