package com.w2a.Rough;

import java.util.Date;

public class TimeStamp {
 static  Date date;
 
	public static void main(String[] args) {
		  date= new Date();
		 System.out.println(date);
		 String ScreenshotName= date.toString().replace(":", "_").replace(" ", " ")+".jpg";
		 System.out.println(ScreenshotName);
		 
	}
}
