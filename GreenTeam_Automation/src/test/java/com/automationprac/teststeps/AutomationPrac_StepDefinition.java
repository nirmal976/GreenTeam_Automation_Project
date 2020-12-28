package com.automationprac.teststeps;

import java.io.IOException;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automationprac.baselog.AutomationPrac_SuperClass;
import com.automationprac.pagefactory.AutomationPrac_MasterPagefactory;
import com.automationprac.util.AutomationPrac_highlighter;
import com.automationprac.util.Automation_PracWait;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutomationPrac_StepDefinition extends AutomationPrac_SuperClass  {  // import
	
	AutomationPrac_MasterPagefactory am; // import com.automationprac.pagefactory.AutomationPrac_MasterPagefactory;
	
	@Given("^As a User I can Open any Browser$")
	public void as_a_User_I_can_Open_any_Browser() throws Throwable {
	log.info("*******>As a User I can Open any Browser<*******");	
	AutomationPrac_SuperClass.initialization();	 //  Add  throws Throwable
	am= PageFactory.initElements(driver, AutomationPrac_MasterPagefactory.class);	// 2nd one 
	}

	@Given("^As a User I can enter \"([^\"]*)\"$")
	public void as_a_User_I_can_enter(String URL) {
		//log.info("*******>As a User I can enter url<*******");
		driver.get(URL);
	}

	@Given("^As a User I can clik on the modual Sign in$")
	public void as_a_User_I_can_clik_on_the_modual_Sign_in() throws IOException {
		log.info("*******>As a User I can clik on the modual Sign in<*******");
		AutomationPrac_highlighter.getcolor(driver,am.getClickhomeSignin(), "red");
		//Automation_PracWait.waitForElement(am.getClicksignin());
		
		am.getClickhomeSignin().click();
	
	}

	@Given("^As a user I can enter Valid \"([^\"]*)\" & \"([^\"]*)\"$")
	public void as_a_user_I_can_enter_Valid(String UserName, String Password) {
		log.info("*******>As a user I can enter Valid username <*******");
		AutomationPrac_highlighter.getcolor(driver, am.getEnterUserName(), "Yellow");
		Automation_PracWait.waitForElement(am.getEnterUserName());
		am.getEnterUserName().sendKeys(UserName);
		log.info("*******>As a user I can enter Valid Password<*******");
		AutomationPrac_highlighter.getcolor(driver, am.getEnterPassWord(),"Yellow");
		Automation_PracWait.waitForElement(am.getEnterPassWord());
		am.getEnterPassWord().sendKeys(Password);
	}

	@Given("^As a user I can clik the Sign in button$")
	public void as_a_user_I_can_clik_the_Sign_in_button() {
	log.info("*******> As a user I can clik the Sign in button <*******");
	AutomationPrac_highlighter.getcolor(driver, am.getClicksignin());
	Automation_PracWait.waitForElement(am.getClicksignin());
	am.getClicksignin().click();
	
	}

	@Given("^As a user I am able to verify the title \"([^\"]*)\"$")
	public void as_a_user_I_am_able_to_see_the_title(String HomepageTitle) {
		log.info("*******> As a user I am able to verify the title <*******");
		if(driver.getPageSource().contains("Login Was UnSuccessful")) {
			
		}
		else { Assert.assertEquals("My account - My Store" , HomepageTitle);
		}
	}
	
	@When("^As a user I can able to click Upper left corner \\(Dresses\\) Link$")
	public void as_a_user_I_can_able_to_click_Upper_left_corner_Dresses_Link() {
		log.info("*******> As a user I can able to click Upper left corner Dresses <*******");
		AutomationPrac_highlighter.getcolor(driver, am.getClickDress(), "red");
		Automation_PracWait.waitForElement(am.getClickDress());
		am.getClickDress().click();
	}

	@When("^As a user I am able to print all the price$")
	public void as_a_user_I_am_able_to_print_all_the_price() {
		List <WebElement> list = am.getDressPrice(); 
		System.out.println("Total dress count num :" + list.size());
		for(WebElement select : list) {
			String listPrice = select.getText();
			System.out.println("Dress Price :" +listPrice);	
	}}

	@When("^As a user I can select Second dress on that list$")
	public void as_a_user_I_can_select_Second_dress_on_that_list() {
		log.info("*******> As a user I can select Second dress on that list <*******");
		AutomationPrac_highlighter.getcolor(driver, am.getClick2ndDress(), "red");
		Automation_PracWait.waitForElement(am.getClick2ndDress());
		am.getClick2ndDress().click();
	}

	@When("^As a user I am able to click Add to cart button$")
	public void as_a_user_I_am_able_to_clik_Add_to_cart_button() {
		log.info("*******> As a user I am able to click Add to cart button <*******");
		AutomationPrac_highlighter.getcolor(driver, am.getClickAddtoCart(), "red");
		Automation_PracWait.waitForElement(am.getClickAddtoCart());
		am.getClickAddtoCart().click();
	}

	@When("^As a user I am able to click on proceed to checkout$")
	public void as_a_user_I_am_able_to_clik_on_proceed_to_checkout() {
		log.info("*******> As a user I am able to click on proceed to checkout <*******");
		AutomationPrac_highlighter.getcolor(driver, am.getProceedToCheckOut(), "red");
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].click();",am.getProceedToCheckOut());
	}

	@When("^As a user I am able to see the total price with shipping$")
	public void as_a_user_I_am_able_to_see_the_total_price_with_shipping() throws IOException {
		log.info("*******> As a user I am able to see the total price with shipping <*******");
		System.out.println("Total Shipping : " + am.getTotalShipping().getText());
		System.out.println("Total Price	: " + am.getTotalPrice().getText());
			
	}

	@When("^As a user I am able to click on signout button$")
	public void as_a_user_I_am_able_to_click_on_signout_button() {
	log.info("*******> As a user I am able to click on signout button <*******");
	AutomationPrac_highlighter.getcolor(driver, am.getClickSignOut(), "red");
	Automation_PracWait.waitForElement(am.getClickSignOut());
	am.getClickSignOut().click();
	}

	@Then("^As a user I am able to verify the Logout title \"([^\"]*)\"$")
	public void as_a_user_I_am_able_to_see_the_Logout_title(String LoginPagetitle) {
		if(driver.getPageSource().contains("Logout UnSuccessful")) {
			
		}
		else { Assert.assertEquals("Order - My Store" , LoginPagetitle);
		}
		
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}
