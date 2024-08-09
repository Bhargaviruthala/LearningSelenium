package com.Amazokart.generic.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {
	public Registerpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id = "name" ,name ="name")
	private WebElement name;
	
	public WebElement getName() {
		return name;
	}
}
