package com.ownprep.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Loginpageown {

	WebDriver ldriver;
	Select ts;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[7]/a")
	WebElement create;
	
	@FindBy(xpath ="//*[@id=\\'tblcrtac\\']/tbody/tr[3]/td[3]/input")
	WebElement user1;
	
	@FindBy(xpath ="//*[@id=\\'tblcrtac\\']/tbody/tr[9]/td[3]/input")
	WebElement last1;
	
	@FindBy(xpath="//*[@id=\\'tblcrtac\\']/tbody/tr[22]/td[3]/select[2]")
	WebElement mon1;
	
	public Loginpageown(WebDriver d) {
		ldriver = d;
		PageFactory.initElements(d, this);
	}
	
	public void redbutton() {
		create.click();
	}
	
	public void userown(String reduser) {
		user1.sendKeys(reduser);
	}
	
	public void redlast(String redlast) {
		last1.sendKeys(redlast);
	}
	
	public void mont(String redmon) {
		Select ts = new Select(mon1);
		ts.selectByVisibleText(redmon);
	//  mon1.sendKeys(redmon);
		
	}
	
	
}
