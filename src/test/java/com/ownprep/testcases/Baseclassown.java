package com.ownprep.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.ownprep.utilities.Readconfigown;

public class Baseclassown {
	
	public static WebDriver driver;
	Readconfigown readown = new Readconfigown();
	public String baseurlown = readown.launchurlown();
	public String userbase = readown.userownre();
	public String lastown = readown.lastownread();
	public String monown = readown.monthownread();
	
	@Parameters("browser")
	@BeforeClass()
	public void setup(String br) {
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",readown.getchromeown());
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		}
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readown.getfirefoxown());
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		driver.get(baseurlown);
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
				
	}
	
	

}
