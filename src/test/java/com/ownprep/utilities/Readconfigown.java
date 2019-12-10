package com.ownprep.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Readconfigown {
	
	Properties pro;
	public Readconfigown()  {
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch (Exception e) {
			System.out.println("exception found"+e.getMessage());

		}
		}
	public String launchurlown() {
		String urlownre = pro.getProperty("baseurlown");
		return urlownre;
		
	}
	
	public String userownre() {
		String userreadd = pro.getProperty("userownco");
		return userreadd;
	}
	
	public String lastownread() {
		String lastnameread = pro.getProperty("lastown");
		return lastnameread;
	}
	
	public String monthownread() {
		String monthownreadd = pro.getProperty("monthown");
		return monthownreadd;
	}
	
	public String getchromeown() {
		String chromepathown = pro.getProperty("chromeown");
		return chromepathown;
	}
	
	public String getfirefoxown() {
		String firefoxpathown = pro.getProperty("firefoxown ");
		return firefoxpathown;
	}
	
	
	

}
