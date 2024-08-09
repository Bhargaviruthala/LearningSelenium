package com.Amazokart.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kidsproduct10 {
@Test(groups="integration")
public void addproduct() {
	Reporter.log("addproduct-kids prd10 successfully",true );
}
@Test(groups="functionality")
public void updateproduct() {
Reporter.log("updateproduct-kids prd10 successfully",true );
}
@Test()
public void deleteproduct() {
	Reporter.log("deleteproduct-kids prd10 successfully",true );

}
}
