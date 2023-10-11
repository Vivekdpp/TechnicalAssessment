package testcases;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basefile.TestBase;
import pagefile.PageTest2;

public class Test2 extends TestBase {
	
	PageTest2 homepage; 

	public Test2() throws IOException {
		super(); 
	}
	
	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		homepage = new PageTest2();
	}
	
    @Test
    public void test2_ListItems() {
        
    	// Locate the "test-2" div and its list items.
        WebElement test2Div = homepage.getTest2Div();
        List<WebElement> listItems = homepage.getListItems(test2Div);
        
        // Assertions for the second list item.
        Assert.assertEquals(listItems.size(), 3);
        Assert.assertEquals(listItems.get(1).getText(), "List Item 2 6");
        Assert.assertEquals(listItems.get(1).findElement(By.className("badge")).getText(), "6");
        System.out.println(listItems.get(1).findElement(By.className("badge")).getText()); 
        
    
    }
		
	@AfterMethod
	public void tearDown() {
	driver.quit();
		
	    }
	}