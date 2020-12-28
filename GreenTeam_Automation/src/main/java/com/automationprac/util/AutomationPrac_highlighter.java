package com.automationprac.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationPrac_highlighter {

	public static void getcolor(WebDriver driver, WebElement webElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: Green; border: 4px solid red;');",
				webElement);
	}

	public static void getcolor(WebDriver driver, WebElement element, String color) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: Green; border: 4px solid " + color + ";');",
				element);
	}

}
