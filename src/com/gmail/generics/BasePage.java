package com.gmail.generics;

import org.apache.commons.exec.LogOutputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
	@FindBy(xpath="//a[contains(@href,'https://accounts.google.com/SignOutOptions?hl=')]")
	private WebElement accountLink;
	
	@FindBy(xpath="//a[contains(@href,'https://accounts.google.com/Logout?hl')]")
	private WebElement signOutLink;
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void verifyTitle(String eTitle)
	{
		WebDriverWait wait= new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Page title is matching", true);
		}
		catch(Exception e)
		{
			Reporter.log("Page title is not matching", true);
		}
	}	
	public void verifyElement( WebElement aElement)
	{
		WebDriverWait wait= new WebDriverWait(driver, 10);
		try
		{
			
			wait.until(ExpectedConditions.visibilityOf(aElement));
			Reporter.log("Element is present", true);
		}
		catch(Exception e)
		{
			Reporter.log("Element is not present", true);
			
		}
	}
	
	public void clickOnAccount()
	{
		accountLink.click();
	}
	
	public void clickOnSignout()
	{
		//To click on sign out
		signOutLink.click();
		
	}
	
	

}
