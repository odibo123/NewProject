package guruPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {
	//Page factory or OR
	@FindBy(how=How.NAME,using= "uid")
         WebElement userIdBtn;
	
	@FindBy(how=How.NAME,using= "password")
    WebElement passwordBtn;
	
	@FindBy(how=How.NAME,using= "btnLogin")
    WebElement LoginBtn;
	
	
	@FindBy(how=How.NAME,using= "btnReset")
    WebElement ResetBtn;
	
	@FindBy(how=How.XPATH,using= "//div[@class='logo']//a//img")
    WebElement Guru99Logo;
	//initialising my page objects
	public LoginPage(){
		PageFactory.initElements(driver, this);
		
	}
		public String validatePageTitle(){
		return driver.getTitle();	
		}
		public boolean validateGuru99Image(){
		return	Guru99Logo.isDisplayed();
			}
		
		public boolean validateGuru99Logo(){
			return	Guru99Logo.isDisplayed();
				}
		public void login(String userId , String password){
		userIdBtn.sendKeys(userId);
		passwordBtn.sendKeys(password);
		LoginBtn.click();
		
}
		public void loginwithInvalidDetails(String userId , String password){
			userIdBtn.sendKeys(userId);
			passwordBtn.sendKeys(password);
			LoginBtn.click();
			
	}
}