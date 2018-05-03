package org.greensTech.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSerchHdfc {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\Sai5\\driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.co.in/");
			WebElement txt=driver.findElement(By.id("lst-ib"));
			txt.sendKeys("hdfc netbanking");
			WebElement clk=driver.findElement(By.name("btnK"));
			clk.click();

	}

}
