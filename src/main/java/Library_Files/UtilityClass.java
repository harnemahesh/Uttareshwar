package Library_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class UtilityClass 
{

	
	//Automation TE:@Viraj 
		//Day:Thursday
		//Date:20-10-2022
		//Fetch data from property File
		
		@Test                        //UN        //PSW
		public static String getdatafromPF(String key) throws IOException
		{
			//Reach upto property file
		 FileInputStream file=new FileInputStream("C:\\Users\\Roshan\\eclipse-workspace\\11_June_Maven\\Mahesh123.properties");
			
		 //create object of properties class
		 Properties prop=new Properties();
		 
		 //Open property file
		 prop.load(file);
		 
		 //To fetch data from PF         //PSW  
		  String value1=prop.getProperty(key);      //admin123   
		 
			return value1; //admin123   
		}
		
		
		
		    //Automation TE:@Viraj 
			//Day:friday
			//Date:21-10-2022
			//Fetch data from Excelsheet
		
		@Test                                      //0          //0
		public static String getdatafromExcel(int RowIndex,int CellIndex) throws EncryptedDocumentException, IOException 
		{
			
		    //To reach Upto Excelsheet
		  FileInputStream file=new FileInputStream("C:\\Users\\Roshan\\eclipse-workspace\\11_June_Maven\\Test_Data\\TestCase.xlsx"); 
		
		  Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet1"); 
			                      //0              //1
		  String Value2=Sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		 
		        return Value2; //OrangeHRM
		}
		
		
		 //Automation TE:@Viraj 
		//Day:friday
		//Date:21-10-2022
		//capture Screenshot

		@Test                                                       //200
		public static void CaptureSceeenshot(WebDriver driver, int TestCaseID) throws IOException 
		{
			 File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				System.out.println(Source);
				
				//Create object of file class                            //200
				File Destination=new File("C:\\Users\\Roshan\\eclipse-workspace\\11_June_Maven\\ScreenShot\\"+TestCaseID+".jpg");
				
				
				//To move Screenshot
				FileHandler.copy(Source,Destination );
			
			
			
		}
		
	
	
}
