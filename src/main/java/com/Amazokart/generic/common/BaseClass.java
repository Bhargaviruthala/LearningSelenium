package com.Amazokart.generic.common;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.Amazokart.generic.propertyutility.ReadPropertyFile;
import com.beust.jcommander.Parameter;

public class BaseClass extends ObjectUtility {
	
	public static WebDriver driver = null;
	
	@DataProvider(name="Register")
	public Object[][] Registerdata() {
		
		Object[][] data=new Object[3][3];
		
		data[0][0]="Bhargavi";
		data[0][1]="bharu123@gmail.com";
		data[0][2]="Bharu@1234";
		
		data[1][0]="Abhi";
		data[1][1]="abhi123@gmail.com";
		data[1][2]="Abhi@123";
		
		data[2][0]="Nischala";
		data[2][1]="nischala123@gmail.com";
		data[2][2]="Nischala@1234";
		return data;		
	}

	@BeforeMethod
	public void login() {
		Reporter.log("login Sucessful", true);
	}

	@AfterMethod
	public void Logout() {
		Reporter.log("Logout Sucessful", true);

	}
	@Parameters("browser")
	@BeforeClass
	public void browserSetup(String bname) 
	{
		// Configure the Browser
		//System.setProperty("webdriver.chrome.driver", "./src/main/resources/jar/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./src/main/resources/jar/geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", "./src/main/resources/jar/msedgedriver.exe");

			//String bname="chrome";
			
		// Using Scanner Class
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the Browser Name: ");
	//	String bname = sc.next();

		// if User gives browsername="chrome"
		if (bname.equals("chrome")) {
			// step1: Launch the Browser-Chrome
			driver = new ChromeDriver();
		}
		// if User gives browsername="firefox"
		else if (bname.equals("firefox")) {
			//step1:Launch the Browser-Firefox
			driver = new FirefoxDriver();
		}
		// if User gives browsername="edge"
		else if (bname.equals("edge")) {
			// step1: Launch the Browser-Edge
			driver = new EdgeDriver();
		}
		else {
			System.out.println("U have Enter the InValid Browser Name and Im Executing DefaultBrowser ");
		    driver = new ChromeDriver();
		}
		
		//Create Object for all
		//ReadPropertyFile p_ref = new ReadPropertyFile();
		objectCreation(); 
		
		//Fetch data
		//String URL=null;
		
		String url = propertyobj.readdata("url");
		
		//propertyobj.displaydata("url");
		//propertyobj.writeData("email", "testing@gmail.com");

		// step2: Navigate to the Application via URL
		driver.get(url);

		Reporter.log("BrowserSetup Sucessful", true);

	}

	
	@AfterClass
	public void closebrowser() {
		// Close The Browser
		driver.close();
		Reporter.log("Closebrowser Sucessful", true);

	}

	@BeforeTest
	public void precondition() {
		Reporter.log("precondition Done Sucessful", true);

	}

	@AfterTest
	public void postcondition() {
		Reporter.log("postcondition Done Sucessful", true);

	}

	@BeforeSuite
	public void getSuiteConnections() {
		Reporter.log("Get SuiteConnections Done Sucessful", true);
	}

	@AfterSuite
	public void terminateSuiteconnection() {
		Reporter.log("Terminate Suiteconnection Done Sucessful", true);

	}


	 

}
