package com.youTube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YouTube {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
	}
	@Test
	public void testOne()
	{
		WebElement txt1=driver.findElement(By.xpath("//input[@id='search']"));
		txt1.sendKeys("TestNG Tutorial");
		
	}
	
	@Test
	public void testTwo()
	{
		WebElement button=driver.findElement(By.xpath("//input[@class='style-scope yt-img-shadow']"));
		button.click();
		Select s=new Select(button);
		s.selectByIndex(1);
		}
	@Test
	
	public void testThree()
	{
		WebElement mix=driver.findElement(By.xpath("//span[@class='yt-core-attributed-string yt-core-attributed-string--ellipsis-truncate style-scope yt-formatted-string'])"));
		mix.click();
		
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}
