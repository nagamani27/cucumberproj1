package org.greenstech.inc.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Set;

public class First {

	public static void main(String[] args) throws Throwable
	{
	File Excelloc=new File("C:\\Users\\RC\\eclipse-workspace\\DataDriven\\lib\\Book2.xlsx");
	FileInputStream f=new FileInputStream(Excelloc);
	Workbook w=new XSSFWorkbook(f);
	Set shtnam=w.getsheet("Sheet1");
	Row row==shtnam.getR
	
	
	

	}

}
