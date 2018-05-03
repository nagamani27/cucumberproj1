package org.cgi;

import org.testng.annotations.Test;

public class TestCase4 
{
	@Test(groups= {"reg","smoke"})
	public void test5() 
	{
		System.out.println("reg/smoke");

	}
	@Test(groups="reg")
	public void test6()
	{
		System.out.println("reg");
	}
	@Test(groups="smoke")
	public void test7()
	{
		System.out.println("smoke");

	}
	@Test(groups="sanity")
	public void test8()
	{
		System.out.println("sanity");
	}
}
