package Module_Login1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage1 
{

	
	//POM-I
	
		//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation                           
		 @FindBy(xpath="//input[@name='username']")   private   WebElement UN;	 //private WebElement UN=driver.findElement(By.xpath("//input[@name='username']"));                                          
		 @FindBy(xpath="//input[@name='password']")   private   WebElement PSW;  //private WebElement PSW=driver.findElement(By.xpath("//input[@name='password']"));
		 @FindBy(xpath="//button[text()=' Login ']")  private   WebElement LoginBtn;  //private WebElement LoginBtn=driver.findElement(By.xpath("//button[text()=' Login ']"));
		
		
		//2. Initialize within a constructor with access level public using pagefactory 	 
		 public OrangeHRMLoginPage1(WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
		 }
		 
		//3. Utilize within a method with access level public
			
			public void EnterUsername(String Username)  //Admin
			{
				UN.sendKeys(Username);  //Admin
			}
		 
			public void EnterPassword(String Password)   //admin123 
			{
				PSW.sendKeys(Password); //admin123 
			}
		 
		   public void Clickloginbtn() 
		   {
			   LoginBtn.click();
		   }
		 
		
		
	
	
	
}
