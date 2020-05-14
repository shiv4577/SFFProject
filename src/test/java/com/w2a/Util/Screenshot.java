package com.w2a.Util;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.w2a.Base.BaseClass;

public class Screenshot extends BaseClass {

	public static String ScreenshotPath;
	public static String ScreenshotName;
	static Date date;
	public static void CaptureScreenshot () throws IOException {
		
		
		File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		ScreenshotName= date.toString().replace(":", "_").replace(" ", " ")+".jpg";
		
		FileUtils.copyFile(SrcFile, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshot\\error.jpg"+ScreenshotName));
	}
	
}