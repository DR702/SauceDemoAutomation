package org.base.qa;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseTest {

	public static WebDriver driver;
	public static Properties pro;

	public BaseTest() throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\user\\Desktop\\Software Testing By Ajeet Sir\\Java Workspace-Eclipse\\HybridFrameworkDR702\\application.properties");

		pro = new Properties();
		pro.load(fis);
	}

	public static void inialization() {
		String browser = pro.getProperty("browser");

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("No such browser");
		}

		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

}
