package org.cgi;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.Objects;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase9 
{
 @DataProvider(name="res")
 public Object[][] data()
 {
	 return new Objects[][] {{"naga","java"}{"MANI","SQL"}};
 }
 @Test(dataProvider="res")
public void Test2(String s1,String s2)
 {
    System.out.println(s1);
    System.out.println(s2);
 }
}
