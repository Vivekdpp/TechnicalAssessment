package testcases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basefile.TestBase;
import pagefile.PageTest5;

public class Test5 extends TestBase {
	
	PageTest5 homepage; 

	public Test5() throws IOException {
		super(); 
	}
	
	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		homepage = new PageTest5();
	}
	
	
	@Test
	public void test5_WaitForButtonAndVerify() {
	    // Wait for the button with a random delay and click it
	    homepage.waitForAndClickButton();

        // Assert that a success message is displayed
        Assert.assertTrue(homepage.isSuccessMessageDisplayed(), "Success message is not displayed");

	    // Assert that the button is now disabled
	    Assert.assertTrue(homepage.isButtonDisabled(), "Button is not disabled");
	}
	
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
		
	    }

}