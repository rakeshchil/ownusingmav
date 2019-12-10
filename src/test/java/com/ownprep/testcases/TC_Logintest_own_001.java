package com.ownprep.testcases;

import org.testng.annotations.Test;

import com.ownprep.pageobjects.Loginpageown;

public class TC_Logintest_own_001 extends Baseclassown {
	
	@Test
	public void logintest() {
	Loginpageown lp = new Loginpageown(driver);
	//driver.get(baseurlown);
	lp.redbutton();
	lp.userown(userbase);
	lp.redlast(lastown);
	lp.mont(monown);
	}

}
