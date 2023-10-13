package testcases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basefile.TestBase;
import pagefile.PageTest6;

public class Test6 extends TestBase {
	
	PageTest6 homepage; //Creating object of LoginPage at class level, so you can use it anywhere in class.

	public Test6() throws IOException {
		super(); //super keyword is used to call super class constructor. In this framework, it is TestBase, where we are reading data from prop file.
		 
	}
	
	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		homepage = new PageTest6();
	}
	
	@Test
	public void test6_GetCellValue() {
	    String cellValue = homepage.getCellValue(2, 2);
	    Assert.assertEquals(cellValue, "Ventosanzap");
	}


		
	@AfterMethod
	public void tearDown() {
	driver.quit();
		
	    }
	}
