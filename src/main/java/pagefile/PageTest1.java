package pagefile;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basefile.TestBase;

public class PageTest1 extends TestBase{

	 //page factory or object repository
	
		@FindBy(id = "inputEmail")
		WebElement inputEmail;
		
		@FindBy(id = "inputPassword")
		WebElement inputPassword;
		
		@FindBy(xpath = "//button[@type='submit']")
	    WebElement LoginButton; 
		
		
		//Initializing the Page Object
		
		public PageTest1() throws IOException{
			
			PageFactory.initElements(driver, this);
			
		}
		

		public void enterEmail(String email) {
			inputEmail.sendKeys(email);
		}

		public void enterPassword(String password) {
		    inputPassword.sendKeys(password);
		}

		public void clickLoginButton() {
		    LoginButton.click();
		}

		public boolean isEmailInputPresent() {
		    return inputEmail.isDisplayed();
		}

		public boolean isPasswordInputPresent() {
		    return inputPassword.isDisplayed();
		}

		public boolean isLoginButtonPresent() {
		    return LoginButton.isDisplayed();
		}
		
}

