package com.Amazokart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kidsproduct6 {
@Test(groups="integration")
public void addproduct() {
	Reporter.log("addproduct-kids prd6 successfully",true );
}
@Test(groups="functionality")
public void updateproduct() {
Reporter.log("updateproduct-kids prd6 successfully",true );
}
@Test(groups="smoke")
public void deleteproduct() {
	Reporter.log("deleteproduct-kids prd6 successfully",true );

}
}
