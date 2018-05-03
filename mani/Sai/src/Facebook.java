import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\Sai5\\driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement txt=driver.findElement(By.id("email"));
			txt.sendKeys("nagamani");
			WebElement txt1=driver.findElement(By.id("pass"));
			txt1.sendKeys("nagamani");
			WebElement clk=driver.findElement(By.id("u_0_2"));
		    clk.click();
			driver.close();
			
			
			
			
			
		

	}

}
