package firstpkg;

import java.io.File;

import java.io.FileReader;
import java.util.Properties;



public class FileHandling 

{

	public static void read_prop_file() throws Exception
	{
	
	FileReader fr=new FileReader("./testdata/config.properties"); //file connection 
	 
	Properties prop= new Properties(); //object of the class
	prop.load(fr); //load the data
	System.out.println(prop.get("broswername")); //get the data 
		
	System.out.println(prop.get("url")); //get the data
	System.out.println(prop.get("username")); //get the data 
	
	
	
	}
	

	   
	   
	   
	
	
	public static void read_text_data() throws Exception
	{
		
		File f= new File("/Users/tatianab/Downloads/Untitled document.txt");
		
		FileReader fr=new FileReader(f);
		
		
		int r = fr.read();  //E/123
		
		while(r!=-1)
		{
			System.out.print((char)r);	
			r=fr.read();
			
			
		}
		
		
	
	}
	public static void main(String[] args) throws Exception
	{
		
		//read_text_data();
		read_prop_file();


	}
	
	
	
}


