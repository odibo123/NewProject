package guruBankSteps;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import guruPages.HomePage;
import guruPages.LoginPage;
import junit.framework.Assert;


public class GuruBankLoginTest extends TestBase {
	LoginPage loginPage = new LoginPage();
	HomePage homePage= new HomePage(); 
	   
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		TestBase .initialization();	
	}

	@Then("^user is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
	String title=loginPage.validatePageTitle();
	
	Assert.assertEquals("Guru99 Bank Home Page",title);
		System.out.println(title);
		
	}

	@Then("^user log into app by entering valid  \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_log_into_app_by_entering_valid_and(String userId, String password) throws Throwable {
		LoginPage loginPage= PageFactory.initElements(driver,LoginPage .class);
		loginPage.login(userId, password);
		 
	}


	@Then("^Home Page is displayed$")
	public void home_Page_is_displayed() throws Throwable {
		String title=homePage.validateHomePageTitle();
		Assert.assertEquals("Guru99 Bank Manager HomePage", title);
		System.out.println(title);
	}

	@Then("^user validate Home Page title$")
	public void user_validate_Home_Page_title() throws Throwable {
	  
	}

	@Then("^user validate userId$")
	public void user_validate_userId() throws Throwable {
	HomePage homepage=PageFactory.initElements(driver,HomePage.class); 
	String userDetails= homepage.validateUserDetails();
	System.out.println(userDetails);
	Assert.assertEquals("Manger Id : mngr225336", userDetails);
	
	}
	@Then("^user enters invalid details in  \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_invalid_details_in_and(String userId, String password) throws Throwable {
		LoginPage loginPage= PageFactory.initElements(driver,LoginPage .class);
		loginPage.loginwithInvalidDetails(userId, password);
		
		
	}

	@Then("^user sees an error message$")
	public void user_sees_an_error_message() throws Throwable {
		 Alert alert =	driver.switchTo().alert();
		 alert.dismiss();
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			Files.copy(scrFile, new File("C:\\Users\\User\\Pictures.png"));
		 
	    
	}
}
