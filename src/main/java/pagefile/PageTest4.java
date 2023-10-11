
package pagefile;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basefile.TestBase; 

public class PageTest4 extends TestBase{

	
	 //page factory or object repository
	
	@FindBy(xpath = "//body/div[@class='container']/div[@class='jumbotron']/div[@id='test-4-div']")
    WebElement test4Div; 
	
	
	//Initializing the Page Object
	
	public PageTest4() throws IOException{
		
		PageFactory.initElements(driver, this);
		
	}

		public boolean isFirstButtonEnabled() {
		    WebElement firstButton = test4Div.findElement(By.xpath("//body/div[@class='container']/div[@class='jumbotron']/div[@id='test-4-div']/button[1]"));
		    return firstButton.isEnabled();
		}

		public boolean isSecondButtonDisabled() {
		    WebElement secondButton = test4Div.findElement(By.xpath("//body/div[@class='container']/div[@class='jumbotron']/div[@id='test-4-div']/button[2]"));
		    return !secondButton.isEnabled();
		}

	
}
