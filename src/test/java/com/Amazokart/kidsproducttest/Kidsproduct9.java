package com.Amazokart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kidsproduct9 {
@Test(groups="integration")
public void addproduct() {
	Reporter.log("addproduct-kids prd9 successfully",true );
}
public void updateproduct() {
Reporter.log("updateproduct-kids prd9 successfully",true );
}
@Test(groups="smoke")
public void deleteproduct() {
	Reporter.log("deleteproduct-kids prd9 successfully",true );

}
}
