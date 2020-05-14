package com.w2a.Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.w2a.Util.ExtentManager;
import com.w2a.Util.Testutil;

public class BaseClass {

	public static WebDriver driver;
	public static Properties config= new Properties();
	public static FileInputStream fis;
	public ExtentReports repo = ExtentManager.getInstance();
	public static ExtentTest test;
	
	@BeforeSuite
	public void Setup() throws Exception {
		
		if(driver==null) {
			
			FileInputStream fis= new FileInputStream("E:\\All Selenium Workspace\\Trimity\\TrimityProjecvtVersion1\\src\\test\\resources\\Properties\\Config.properties");
			config.load(fis);
			
			if(config.getProperty("browser").equals("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "E:\\All Selenium Workspace\\Trimity\\TrimityProjecvtVersion1\\src\\test\\resources\\Executable\\chromedriver.exe");
				  driver= new ChromeDriver();
				 driver.manage().window().maximize();
				 driver.get(config.getProperty("url"));
				 driver.manage().timeouts().implicitlyWait(Testutil.Implicitly_wait, TimeUnit.SECONDS);
				 
				 
			}
		}
			
		}
		
		
	
	
	/*
	 * @AfterSuite public void TearDown() {
	 * 
	 * }
	 */
}
