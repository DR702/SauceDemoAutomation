package org.tests.qa;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.utils.qa.Log;

public class ReportingLog4JTest {

    @Test
    public void TC001_LoginTest() {

   Log.info("TC001-Start");
   
   Log.info("Browser Lanching");
   WebDriver driver=new ChromeDriver();
   
   Log.info("Loading the URL");
   driver.get("https://www.google.com/");
   
   String actualTitle=driver.getTitle();
   
   if(actualTitle.equals("Google1")) {
	  Log.info("Test001------Passed");
   }else {
	   Log.error("TC001-----Failed");
   }
   
   
   Log.warn("Browser Closing");
   driver.quit();
}

}











