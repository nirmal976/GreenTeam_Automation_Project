package com.automationprac.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automationprac.baselog.AutomationPrac_SuperClass;

public class Automation_PracWait extends AutomationPrac_SuperClass {
	public static void waitForElement(WebElement elem) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(elem));
		
	}
}
