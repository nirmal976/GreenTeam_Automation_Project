package com.automationprac.pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationprac.baselog.AutomationPrac_SuperClass;

public class AutomationPrac_MasterPagefactory extends AutomationPrac_SuperClass {

	public AutomationPrac_MasterPagefactory() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "Sign in") // import org.openqa.selenium.support.FindBy;
	@CacheLookup // import org.openqa.selenium.support.CacheLookup;
	private WebElement clickhomeSignin;

	@FindBy(xpath = "//*[@id='email']")
	@CacheLookup
	private WebElement enterUserName;

	@FindBy(xpath = "//*[@id='passwd']")
	@CacheLookup
	private WebElement enterPassWord;

	@FindBy(xpath = "//*[@id='SubmitLogin']")
	@CacheLookup
	private WebElement clicksignin;

	@FindBy(xpath = "(//*[contains(@class,'sf-with-ul')])[4]")
	@CacheLookup
	private WebElement clickDress;

	@FindBy(partialLinkText = "Sign out")
	@CacheLookup
	private WebElement ClickSignOut;

	@FindBy(xpath="//*[@itemprop='price']")
	@CacheLookup
	private List <WebElement> DressPrice;
	
	@FindBy(xpath = "(//*[@class='icon-chevron-right right'])[2]")
	private WebElement ProceedToCheckOut;
	
	@FindBy(xpath = "//*[@id='total_shipping']")
	private WebElement TotalShipping;
	
	@FindBy(xpath= "//*[@id='total_price']")
	private WebElement TotalPrice;
	
	
	public WebElement getTotalPrice() {
		return TotalPrice;
	}

	public WebElement getTotalShipping() {
		return TotalShipping;
	}

	public WebElement getProceedToCheckOut() {
		return ProceedToCheckOut;
	}

	public List<WebElement> getDressPrice() {
		return DressPrice;
	}

	@FindBy(xpath="(//*[@class='product-name'])[4]")
	@CacheLookup
	private WebElement Click2ndDress;
	
	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	@CacheLookup
	private WebElement ClickAddtoCart;
	
	
	
	
	public WebElement getClickAddtoCart() {
		return ClickAddtoCart;
	}

	public WebElement getClick2ndDress() {
		return Click2ndDress;
	}

	
	public WebElement getClickSignOut() {

		return ClickSignOut;
	}

	public WebElement getClickhomeSignin() {

		return clickhomeSignin;
	}

	public WebElement getEnterUserName() {
		enterUserName.clear();
		return enterUserName;
	}

	public WebElement getEnterPassWord() {
		enterPassWord.clear();
		return enterPassWord;
	}

	public WebElement getClicksignin() {
		return clicksignin;
	}

	public WebElement getClickDress() {
		return clickDress;
	}

}
