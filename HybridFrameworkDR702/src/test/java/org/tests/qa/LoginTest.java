package org.tests.qa;

import java.io.IOException;

import org.base.qa.BaseTest;
import org.pages.qa.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utils.qa.Log;



public class LoginTest extends BaseTest {

	LoginPage lp;
	public LoginTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		Log.info("Browser Launching and Loading URL");
		inialization();
		lp=new LoginPage();
	}
	
	@Test(dataProvider = "getData")
	public void TC001_Valid_Login(String un, String pwd) {
		Log.info("Login Test started");
		lp.login(un, pwd);
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/login");
	}
	
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] obj=new Object[2][2];
		
		obj[0][0]="Admin";
		obj[0][1]="Admin@123";
		obj[1][0]="SuperAdmin";
		obj[1][1]="SA@123";
		
		return obj;
	}
	
	@AfterMethod
	public void tearDown() {
		
		Log.info("Browser Closed");
		driver.quit();
	}
	

}















