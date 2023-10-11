
package testcases;


import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basefile.TestBase;
import pagefile.PageTest3;

public class Test3 extends TestBase {
	
	PageTest3 homepage; 

	public Test3() throws IOException {
		super(); 
	}
	
	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		homepage = new PageTest3();
	}
	
	 @Test
	    public void testCustomDropdown() {
		  
		    String defaultOption = homepage.option1Default();
	        Assert.assertEquals(defaultOption, "Option 1", "Default selected option is not 'Option 1'");
	        System.out.println(defaultOption);
	        
	        
		    homepage.openDropdown();
	        homepage.selectOption("Option 3");
	   
	       
	    }
	  
	@AfterMethod
	public void tearDown() {
	driver.quit();
		
	    }
	}