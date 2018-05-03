

import java.io.InputStream;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task4 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RC\\eclipse-workspace\\mani\\Sai\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/registration/");
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the 1st country name:");
		String name1=s1.next();
		System.out.println("enter the 2nd country name:");
		String name2=s1.next();
		
		WebElement s3=driver.findElement(By.id("dropdown_7"));
		Select s2=new Select(s3);
		s2.selectByValue(name1);
		s2.selectByValue(name2);
		
		
	}

	

	}


