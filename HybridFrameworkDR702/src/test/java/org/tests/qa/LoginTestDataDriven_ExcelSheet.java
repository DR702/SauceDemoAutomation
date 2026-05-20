package org.tests.qa;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.base.qa.BaseTest;
import org.pages.qa.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utils.qa.ExcelRedaer;

public class LoginTestDataDriven_ExcelSheet extends BaseTest {

	LoginPage lp;
	public LoginTestDataDriven_ExcelSheet() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		inialization();
		lp=new LoginPage();
	}
	
	@Test(dataProvider = "getData")
	public void TC001_Valid_Login(String un, String pwd) {
		lp.login(un, pwd);
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/login");
	}
	
	
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException{
		
		Object[][] obj=ExcelRedaer.getExcelData("LoginTextData");
		
		return obj;
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}















