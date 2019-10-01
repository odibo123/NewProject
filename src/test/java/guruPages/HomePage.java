package guruPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(how=How.XPATH,using= "//td[contains(text(),'Manger Id : mngr225336')]")
    WebElement userIDtetails;
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
		
	}
	
	public String validateHomePageTitle(){
		return driver.getTitle();	
		}
	
	public String validateUserDetails(){
		return userIDtetails.getText();	
			}
}
