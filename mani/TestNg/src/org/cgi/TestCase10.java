package org.cgi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase10 
{
 @Test(retryAnalyzer=Failed.class)
 private void test1()
 {
 Assert.assertTrue(true);
 }
 @Test
 public void test2() 
 {
	 Assert.assertTrue(false);
 }
 
}
