package pagefile;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basefile.TestBase; 

public class PageTest2 extends TestBase{

	
	 //page factory or object repository
	
	@FindBy(id = "test-2-div")
	WebElement test2Div;
	
	
	//Initializing the Page Object
	
	public PageTest2() throws IOException{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getTest2Div() {
	    return test2Div;
	}

	public List<WebElement> getListItems(WebElement container) {
	    return container.findElements(By.tagName("li"));
	}

	
	
}
