package Cucumber2.Cucumber2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Test1
{
WebDriver driver=null;
@Given("^The user is on Demoqa Website$")
public void the_user_is_on_Demoqa_Website() 
 {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\RC\\eclipse-workspace\\mani\\Cucumber2\\lib\\chromedriver.exe"); 
	driver = new ChromeDriver();
	driver.get("http://demoqa.com/registration/");
	
	
 }

@When("^The user Check the status$")
public void the_user_Check_the_status() 
 {
	
	driver.findElement(By.xpath("//input[@value='married']")).click();;
	
 }

@Then("^The user click the button$")
public void the_user_click_the_button() 
 {
	boolean select=driver.findElement(By.xpath("//input[@value='married']")).isSelected();
	Assert.assertTrue(select);
	System.out.println("married radio button selected");
	
 }

@When("^The user check hobby$")
public void the_user_check_hobby() 
 {
	driver.findElement(By.xpath("(//input[@value='dance'])")).click();
	driver.findElement(By.xpath("//input[@value='reading']")).click();
	driver.findElement(By.xpath("//input[@value='cricket ']")).click();

 }


@Then("^The user click check$")
public void the_user_click_check() 
 {
	boolean dance=driver.findElement(By.xpath("(//input[@value='dance'])")).isSelected();
	boolean reading=driver.findElement(By.xpath("//input[@value='reading']")).isSelected();
	boolean cricket=driver.findElement(By.xpath("//input[@value='cricket ']")).isSelected();
	Assert.assertTrue(cricket && dance && reading);
	System.out.println("The check boxs are selected");

 }


}
