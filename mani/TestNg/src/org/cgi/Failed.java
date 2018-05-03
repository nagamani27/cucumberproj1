package org.cgi;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed implements IRetryAnalyzer
{
 int min=0,max=10;

@Override
public boolean retry(ITestResult result) 
{
	System.out.println(result.getName());
	if(min<=max)
	{
		min++;
		return true;
	}
	return false;
}
 
 
 
}
