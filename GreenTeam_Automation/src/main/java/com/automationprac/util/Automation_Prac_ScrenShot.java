package com.automationprac.util;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Automation_Prac_ScrenShot {
	public static String getScreenShot(WebDriver driver, String name) throws IOException {
		String date = new  SimpleDateFormat("MM.dd.yyyy-hh.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+ "/ScreenShots/" + name + date +".png";
		File obj = new File(destination);
		FileUtils.copyFile(source, obj);
		return destination;		
	}
	
	
}
