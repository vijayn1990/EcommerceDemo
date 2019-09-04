package com.gmail.generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils 
{
	/**
	 * 
	 * @param driver
	 * @param name
	 * @author Vijay
	 * @throws IOException
	 */
	public static void getScreenShot(WebDriver driver, String name)
	{
		try
		{
			TakesScreenshot t= (TakesScreenshot)driver;
			File src= t.getScreenshotAs(OutputType.FILE);
			File dest= new File("./screenshots/"+name+".jpg");
			FileUtils.copyFile(src, dest);
		}
		catch(IOException e)
		{
			
		}
	}
	public static void selectByIndex(WebElement  element, int index)
	{
		Select sel= new Select(element);
		sel.selectByIndex(index);
	}
	
	public static void selectByValue(WebElement element, String value)
	{
		Select sel= new Select(element);
		sel.selectByValue(value);
	}
	
	public static void selectByVisibleText(WebElement element, String text)
	{
		Select sel= new Select(element);
		sel.selectByVisibleText(text);
	}
	public static void accept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	
}
