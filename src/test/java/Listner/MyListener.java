package Listner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.w2a.Base.BaseClass;
import com.w2a.Util.Screenshot;

public class MyListener extends BaseClass implements ITestListener {

	
	 
	public void onTestStart(ITestResult result) {

			
		test=repo.startTest(result.getName().toUpperCase());
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(LogStatus.PASS, result.getName().toUpperCase()+"Pass" );
		repo.endTest(test);
		repo.flush();
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
 		Reporter.log("capture screenshot ");
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		try {
			Screenshot.CaptureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.FAIL,result.getName().toUpperCase()+"Failed with exception:"+ result.getThrowable());
		test.log(LogStatus.FAIL,test.addScreenCapture(Screenshot.ScreenshotName));
		
		Reporter.log("<a target=\"_blank\" href="+ Screenshot.ScreenshotName+">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\"href="+Screenshot.ScreenshotName+"><img src="+Screenshot.ScreenshotName+"hight=200 width=200></img></a>");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
