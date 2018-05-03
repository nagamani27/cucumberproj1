package org.cgi;

import org.testng.annotations.Test;

public class TestCase8 
{
	@Test(invocationCount=10,threadPoolSize=10)
	 public void test1() 
	 {
	    System.out.println(Thread.currentThread().getId());

	 }
}
