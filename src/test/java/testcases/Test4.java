package testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basefile.TestBase;
import pagefile.PageTest4;


public class Test4 extends TestBase {
	
	PageTest4 homepage; 

	public Test4() throws IOException {
		super(); 
		 
	}
	
	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		homepage = new PageTest4();
	}
	
    @Test
    public void test4_ButtonStates() {
       
        
        boolean isFirstButtonEnabled = homepage.isFirstButtonEnabled();
        boolean isSecondButtonDisabled = homepage.isSecondButtonDisabled();

        // Assertions for button states.
        Assert.assertTrue(isFirstButtonEnabled, "First button is not enabled");
        Assert.assertTrue(isSecondButtonDisabled, "Second button is not disabled");
    }

	@AfterMethod
	public void tearDown() {
	driver.quit();
		
	    }
}
