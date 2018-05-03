package org.cgi;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestCase1 
{
	@Parameters(value= {"user"})
	@Test
	public void test5(@Optional("mani") String user1)
	{
		System.out.println(user1);
	
	}
	
	
}