package com.Amazokart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kidsproduct3 {
@Test(groups="integration")
public void addproduct() {
	Reporter.log("addproduct-kids prd3 successfully",true );
}
@Test(groups="functionality")
public void updateproduct() {
	Reporter.log("updateproduct-kids prd3 successfully",true );
}
@Test(groups="smoke")
public void deleteproduct() {
	Reporter.log("deleteproduct-kids prd3 successfully",true );

}
}
