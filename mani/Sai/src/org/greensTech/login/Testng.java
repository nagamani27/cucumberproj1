package org.greensTech.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testng  
{
 

  @BeforeClass
  public void BeforeClass()
  {
	System.out.println("this is before class");
  }  
  @AfterClass
  public void AfterClass()
  {
	System.out.println("this is after class");

   }
  @Test
  public void Test()
  {
	System.out.println("this is test method");
  }
  
  @BeforeMethod
    public void BeforeMethod()
  {
	System.out.println("this is before method");
  }
  @AfterMethod
  public void AfterMethod()
  {
	System.out.println("this is aftermethod");

  }

}
