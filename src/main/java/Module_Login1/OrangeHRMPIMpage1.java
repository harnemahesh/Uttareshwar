package Module_Login1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPIMpage1 
{

	
	//POM-II
	
		//1. Data members/Global Variables should be declared globally with access level private by using @findby                                 
		 @FindBy(xpath="//span[@class='oxd-userdropdown-tab']")  private   WebElement UserName; //private WebElement UserName=driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
		 
		 @FindBy(xpath="//a[text()='Logout']")  private WebElement  logoutbtn;
		
		//2. Initialize within a constructor with access level public using pagefactory 
		 public OrangeHRMPIMpage1(WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
		 }
		
			//3. Utilize within a method with access level public
		
		
		 public String getUsername() 
		 {
			String ActResult=UserName.getText();
			
			return ActResult;            //Paul Collings


		 }
		 
		 public void clickOnUsername() 
		 {
			 UserName.click();
		 }

		 public void clickLogoutbtn()
		 {
			 logoutbtn.click();
		 }
		 
	
	
	
	
}
