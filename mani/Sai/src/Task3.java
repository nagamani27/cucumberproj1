

import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RC\\eclipse-workspace\\mani\\Sai\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/registration/");
		
		WebElement s3=driver.findElement(By.id("dropdown_7"));
		Select s2=new Select(s3);
		s2.selectByVisibleText("India");
		WebElement op=s2.getFirstSelectedOption();
		
		System.out.println(op.getText());
		
		driver.close();
		
	}

	

	}


