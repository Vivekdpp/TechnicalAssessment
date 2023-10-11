package testcases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basefile.TestBase;
import pagefile.PageTest1;

public class Test1 extends TestBase {
	
	PageTest1 homepage; //Creating object of HomePage at class level, so you can use it anywhere in class.

	public Test1() throws IOException {
		super(); //super keyword is used to call super class constructor. In this framework, it is TestBase, where we are reading data from prop file.
		 
	}
	
	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		homepage = new PageTest1();
	}
	
    @Test
    public void test1_Login() {
    	homepage.enterEmail(prop.getProperty("email"));
    	homepage.enterPassword(prop.getProperty("password"));
    	homepage.clickLoginButton();
    	
    	String email = prop.getProperty("email");
    	String password = prop.getProperty("password");
    	System.out.println("Email: " + email);
    	System.out.println("Password: " + password);
        
        Assert.assertTrue(homepage.isEmailInputPresent());
        Assert.assertTrue(homepage.isPasswordInputPresent());
        Assert.assertTrue(homepage.isLoginButtonPresent());
    }

		
	@AfterMethod
	public void tearDown() {
	driver.quit();
		
	    }
	}