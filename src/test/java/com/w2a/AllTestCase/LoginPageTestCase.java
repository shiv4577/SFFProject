package com.w2a.AllTestCase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.w2a.AllPages.LoginPage;
import com.w2a.Base.BaseClass;

public class LoginPageTestCase extends BaseClass {

	public static LoginPage Login;
	
	/*
	 * ExtentHtmlReporter reporter; ExtentTest logger1; ExtentReports extent;
	 */
	
	/*
	 * @BeforeTest
	 * 
	 * public void SetExtentReport() {
	 * 
	 * String REportdateName = new SimpleDateFormat("yyyymmddhhmmss").format(new
	 * Date()); // Add date and time to // report
	 * 
	 * // it is show you where you have to give put your extent report reporter =
	 * new ExtentHtmlReporter( System.getProperty("user.dir") +
	 * "/ExtenReport/LoginPageReport/" + REportdateName + ".html");
	 * reporter.config().setDocumentTitle("Trimity Project Report");
	 * reporter.config().setReportName("Login Page Test Report");
	 * reporter.config().setTheme(Theme.DARK); extent = new ExtentReports(); // this
	 * class create report for u extent.attachReporter(reporter); // attach reporter
	 * which we have created in 1st step extent.setSystemInfo("HostName",
	 * "LocalHost"); extent.setSystemInfo("OS", "Windows");
	 * extent.setSystemInfo("TesterName", "Shiv"); extent.setSystemInfo("Browser",
	 * "Chrome"); }
	 * 
	 * @AfterTest public void EndReport() { extent.flush(); }
	 */
	
	
	@Test
	public void LoginPageTestCaseMethod() {
		//logger1 = extent.createTest("LoginPageTestCaseMethod");
		Login= new LoginPage(driver);
		Login.ClickOnLoginButtonMethod();
		Login.EnterUserNameMethod("brm5488@gmail.com");
		Login.EnterPasswordMethod("9453bfc495e3");
		Login.ClickOnSubmitButton();
		//Login.VerifyLoginTitle()
	}
	

	/*
	 * @AfterMethod public void tearDown(ITestResult result) throws IOException { if
	 * (result.getStatus() == ITestResult.FAILURE) { logger1.log(Status.FAIL,
	 * "Test Case Fail Is" + result.getName()); // To add name in extent
	 * logger1.log(Status.FAIL, "Test Case Fail Is" + result.getThrowable()); // To
	 * aadd error or exception
	 * 
	 * // RegisterTestCase=classname // getName=capturing screenshot name String
	 * screenshotPath = LoginPageTestCase.getScreenshot(driver, result.getName());
	 * // capture location of // screenshot
	 * logger1.addScreenCaptureFromPath(screenshotPath); // Add screenshot in report
	 * }
	 * 
	 * else if ((result.getStatus() == ITestResult.SKIP)) { logger1.log(Status.SKIP,
	 * "Test Case Skip Is" + result.getName()); } else if ((result.getStatus() ==
	 * ITestResult.SUCCESS)) { logger1.log(Status.PASS, "Test Case Pass Is" +
	 * result.getName()); } }
	 * 
	 * public static String getScreenshot(WebDriver driver, String screenshotname)
	 * throws IOException { String dateName = new
	 * SimpleDateFormat("yyyymMmddhhmmss").format(new Date()); TakesScreenshot ts =
	 * (TakesScreenshot) driver; File source = ts.getScreenshotAs(OutputType.FILE);
	 * // AfterExcecution u could see a folder "Failed test sceenshot "under src
	 * folder String destination = System.getProperty("user.dir") +
	 * "/Screenshot/LoginPageFiledTestCaseScreenshots/" + screenshotname + dateName
	 * + ".png"; File finalDestination = new File(destination);
	 * FileUtils.copyFile(source, finalDestination);
	 * 
	 * return destination;
	 * 
	 * }
	 */
}
