package org.cgi;

import org.testng.annotations.Test;

public class TestCase7
{
	@Test
	 public void test1() 
	 {
	    System.out.println(Thread.currentThread().getId());

	 }
	@Test
	 public void test2() 
	 {
		System.out.println(Thread.currentThread().getId());

	 }
	@Test
	 public void test3() 
	 {
		System.out.println(Thread.currentThread().getId());

	 }
 
}
