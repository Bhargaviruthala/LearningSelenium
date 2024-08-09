package com.Amazokart.kidsproducttest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Amazokart.generic.common.BaseClass;
import com.beust.jcommander.Parameter;

public class Kidsproduct extends BaseClass {
	
@Test(priority=1,invocationCount=2,groups="integration")
public void addproduct() {
	//Assert.fail();
	Reporter.log("addproduct-kids prd1 successfully",true );
}
@Test(priority=2, dependsOnMethods = "addproduct", groups ="functionality")
public void updateproduct() {
	Reporter.log("updateproduct-kids prd1 successfully",true );
}
@Test(priority=3,dependsOnMethods = "addproduct",enabled=false,groups="smoke")
public void deleteproduct() {
	Reporter.log("deleteproduct-kids prd1 successfully",true );

}
}
