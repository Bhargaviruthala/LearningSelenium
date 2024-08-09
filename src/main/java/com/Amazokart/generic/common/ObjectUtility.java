package com.Amazokart.generic.common;

import com.Amazokart.generic.excelutility.ReadExcelFile;
import com.Amazokart.generic.javautility.Javautility;
import com.Amazokart.generic.propertyutility.ReadPropertyFile;
import com.Amazokart.generic.webdriverutility.WebdriverUtility;

public class ObjectUtility implements FrameworkConstant {
	public ReadExcelFile excelobj;
	public Javautility javaobj;
	public ReadPropertyFile propertyobj;
	public WebdriverUtility WebDriverobj;
	
	public  void objectCreation() {
		 excelobj=new ReadExcelFile();
		 javaobj=new Javautility();
	 propertyobj=new ReadPropertyFile();
		WebDriverobj=new WebdriverUtility();
	}

}
