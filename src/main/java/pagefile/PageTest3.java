
package pagefile;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basefile.TestBase; 

public class PageTest3 extends TestBase{

	
	 //page factory or object repository
	
	@FindBy(xpath = "//button[@id='dropdownMenuButton']")
	WebElement test3Div;
	
	
//	@FindBy(xpath = "//button[@id='dropdownMenuButton']")
//    WebElement dropdown;
//	
//	
//	//Initializing the Page Object
//	
	public PageTest3() throws IOException{
		
		PageFactory.initElements(driver, this);
		
    }
	
	public String option1Default() {
		WebElement defaultOption = test3Div;
		return defaultOption.getText();
		
	}

    public void openDropdown() {
        WebElement dropdown = test3Div; // Replace with the appropriate locator
        dropdown.click();
    }

    public void selectOption(String optionText) {
        WebElement option = driver.findElement(By.xpath("//a[contains(text(),'Option 3')]"));
        option.click();
    }
	


	}


	
	

