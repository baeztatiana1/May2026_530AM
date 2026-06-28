package firstpkg;

import java.io.FileReader;
import java.util.Properties;
import java.io.File;



public class Filehandling2 
{

	public static void read_finishline() throws Exception
	{
		FileReader fl=new FileReader ("./testdata/finishline");
	
		Properties prop=new Properties();
		prop.load(fl);
		System.out.println(prop.get("email"));
		System.out.println(prop.get("Firstname"));
		
	}
	
	
	public static void main(String[] args) throws Exception 
	{
		
		read_finishline();

	}

}
