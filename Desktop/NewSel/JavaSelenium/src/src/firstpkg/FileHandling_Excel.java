package firstpkg;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class FileHandling_Excel 
{

	public static void read_excel_data() throws Exception
	{
	
		//for loop 1-10
	//	for(int i=1;i<11;i++)
		//System.out.println(i);
		
		FileInputStream fis=new FileInputStream( "testdata/exceldata.xlsx");
		
	  
	   XSSFWorkbook wb=new XSSFWorkbook(fis);
	   
	   XSSFSheet sh1= wb.getSheet("data");
	    int nr=sh1.getPhysicalNumberOfRows(); //4 rows
	   
	   for (int i=0;i<nr;i++)
	   {
		  XSSFRow row=sh1.getRow (i); //i=0 , 0<4
		  
		 int nc= row.getPhysicalNumberOfCells(); //i=o, nc=2, i=1,nc=3
		  
		 
		 
	   }
	   /*
	   //first row 
	    XSSFRow row1=sh1.getRow(0);
	  
	    
	    XSSFCell col1=row1.getCell(0); //first column 
	   
	    System.out.println(col1.getStringCellValue());
	    
	    
	    	
	    XSSFCell col2=row1.getCell(1); //second  column 
	    System.out.println(col2.getStringCellValue());
		*/
	}
	
	
	
	
	
	public static void main(String[] args) throws Exception
{
		
		read_excel_data();
		

	}

}
