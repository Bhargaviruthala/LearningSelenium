package com.Amazokart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kidsproduct7 {
@Test(groups="integration")
public void addproduct() {
	Reporter.log("addproduct-kids prd7 successfully",true );
}
@Test(groups="functionality")
public void updateproduct() {
Reporter.log("updateproduct-kids prd7 successfully",true );
}
@Test(groups="smoke")
public void deleteproduct() {
	Reporter.log("deleteproduct-kids prd7 successfully",true );

}
}
