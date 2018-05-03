package org.cgi;

import org.testng.annotations.Test;


public class TestCase 
{
@Test(priority=4)
public void test1() 
{
	System.out.println("testcase1");

}
@Test(priority=2)
public void test2()
{
	System.out.println("testcase2");
}
@Test(dependsOnMethods= {"test1"})//by default 0 priority
public void test3()
{
	System.out.println("testcase3");

}
}
