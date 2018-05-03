package org.cgi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase6 
{    @Test
	 public void Test7()
		{
			String s="nagamani";
			Assert.assertEquals("nagaman", s);
		}
	@Test
    public void Test8()
	{
		String s="nagamani";
		Assert.assertEquals("nagamani", s);
	}

   
	@Test
    public void Test9()
	{
		String s="nagamani";
		Assert.assertTrue(s.contains("n"));
	}
	@Test
    public void Test10()
	{
		String s="nagamani";
		Assert.assertTrue(s.contains("l"));
	}
	
	
}
