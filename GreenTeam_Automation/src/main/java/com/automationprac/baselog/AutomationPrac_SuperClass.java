package com.automationprac.baselog;

import java.io.FileInputStream;


import java.util.Properties;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationPrac_SuperClass {

	public static WebDriver driver; 			// import from Selenium.Wedriver
	public static Logger log;					// import org.apache.log4j.Logger
	public static Properties configPro;			// import java.util.Properties;
	
	
	// declare a constructor for initialize the logger
	
	public AutomationPrac_SuperClass() {
		
		log=Logger.getLogger("Nirmal");  // string
		PropertyConfigurator.configure("Log4j.properties");	 // log4j.properties	
				
	}
	
	
	public static void initialization() throws Throwable {
		
		configPro= new Properties();
		
		// import from import java.io.FileInputStream;
		FileInputStream ConfigproFile = new FileInputStream("Config.properties"); // change to throws Throwable
		configPro.load(ConfigproFile);
		
		String br = configPro.getProperty("browser");
		
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", configPro.getProperty("chromebrowser"));
			driver = new ChromeDriver(); //import org.openqa.selenium.chrome.ChromeDriver;
		}
		
		else if(br.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", configPro.getProperty("firefoxbrowser"));
			driver = new FirefoxDriver(); 		// import org.openqa.selenium.firefox.FirefoxDriver;
		}
		else if (br.equals("medge")) {
			System.setProperty("webdriver.edge.driver", configPro.getProperty("medgebrowser"));
			
			driver = new EdgeDriver();  // import org.openqa.selenium.edge.EdgeDriver;
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
}
