package pagefile;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basefile.TestBase; 

public class PageTest6 extends TestBase{

	
	 //page factory or object repository
	
	@FindBy(xpath = "//table[@class='table table-bordered table-dark']")
	WebElement grid;

	//Initializing the Page Object
	
	public PageTest6() throws IOException{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String getCellValue(int row, int col) {
	    WebElement cell = grid.findElement(By.xpath(".//tr[" + (row + 1) + "]/td[" + (col + 1) + "]"));
	    return cell.getText();
	}

	
	
}
