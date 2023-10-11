
package pagefile;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basefile.TestBase; 

public class PageTest5 extends TestBase{

	
	 //page factory or object repository
	
	@FindBy(xpath = "//button[@id='test5-button']")
	WebElement test5Div;
	
	
	//Initializing the Page Object
	
	public PageTest5() throws IOException{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void waitForAndClickButton() {
	    WebElement button = test5Div;

	    // Implementing a random delay 
	    int minDelay = 5; // Minimum delay in seconds
	    int maxDelay = 15; // Maximum delay in seconds
	    int randomDelay = minDelay + (int) (Math.random() * ((maxDelay - minDelay) + 1));
	    
	    Duration duration = Duration.ofSeconds(randomDelay);

	    // Wait for the button with the random delay 
	    WebDriverWait wait = new WebDriverWait(driver, duration);
	    wait.until(ExpectedConditions.visibilityOf(button));

	    // Click the button
	    button.click();
	}

	public boolean isSuccessMessageDisplayed() {
	    try {
	        WebElement successMessage = test5Div.findElement(By.xpath("//div[@id='test5-alert']"));
	        return successMessage.isDisplayed();
	    } catch (NoSuchElementException e) {
	        return false; // Return false if the success message is not found
	    }
	}

	public boolean isButtonDisabled() {
	    WebElement button = test5Div;
	    return !button.isEnabled();
	}
}
