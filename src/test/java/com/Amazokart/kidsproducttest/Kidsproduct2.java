package com.Amazokart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kidsproduct2 {
	
	@Test(invocationCount = 1, groups="integration")
	public void addproduct() {
		Reporter.log("addproduct-kids prd2 successfully",true );

	}	
@Test(invocationCount = 2,dependsOnMethods = "addproduct",groups="functionality")
public void updateproduct() {
	Reporter.log("updateproduct-kids prd2 successfully",true );
}
@Test(invocationCount = 2,groups="smoke")
public void deleteproduct() {
	Reporter.log("deleteproduct-kids prd2 successfully",true );

}
}
