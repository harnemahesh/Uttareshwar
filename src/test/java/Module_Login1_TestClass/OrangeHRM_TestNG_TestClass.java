package Module_Login1_TestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Base_Class;
import Library_Files.UtilityClass;
import Module_Login1.OrangeHRMLoginPage1;
import Module_Login1.OrangeHRMPIMpage1;

public class OrangeHRM_TestNG_TestClass extends Base_Class
{

	    //InitializeBrowser()
		//public WebDriver driver;
		
		OrangeHRMLoginPage1 Login1;
		OrangeHRMPIMpage1 PIMPage1;
		
		int TestCaseID; //200
		
		@BeforeClass
		public void OpenBrowser() throws InterruptedException 
		{
			InitializeBrowser();
			
			//Create Object of POM-I
			Login1=new OrangeHRMLoginPage1(driver);
			
			//Create Object of POM-II
			PIMPage1=new OrangeHRMPIMpage1(driver);
			
		}
		
		@BeforeMethod
		public void login() throws IOException  
		{
			Login1.EnterUsername(UtilityClass.getdatafromPF("UN"));  //Admin
			
			Login1.EnterPassword(UtilityClass.getdatafromPF("PSW")); //admin123   
			
			Login1.Clickloginbtn();
			
		}
		
		@Test(priority=1)
		public void verifyUserName() throws EncryptedDocumentException, IOException  
		{
			TestCaseID=100;
			
			String ActualUserName=PIMPage1.getUsername();  //Paul Collings
			
		    String ExpectedUserName=UtilityClass.getdatafromExcel(0,0);  //Collings
		   
		    Assert.assertEquals(ActualUserName, ExpectedUserName);
			
		}
		
		@Test(priority=2)
		public void VerifyTitle() throws EncryptedDocumentException, IOException 
		{
			TestCaseID=200;
			
			String ActualTitle=driver.getTitle();
			String ExpectedTitle=UtilityClass.getdatafromExcel(0, 1);  //OrangeHRM
			
			Assert.assertEquals(ActualTitle, ExpectedTitle);
		}
		
		
		@AfterMethod
		public void logout(ITestResult Result) throws IOException   //Pass        // fail
		{
			   ////Pass                     //fail
			if(Result.getStatus()==ITestResult.FAILURE) 
			{
				UtilityClass.CaptureSceeenshot(driver, TestCaseID);  //200
			}
			
			
			
			PIMPage1.clickOnUsername();
			
			PIMPage1.clickLogoutbtn();
			
			
		}
		
		
		@AfterClass
		public void CloseBrowser() 
		{
		        driver.close();
		}
		
	
	
}
