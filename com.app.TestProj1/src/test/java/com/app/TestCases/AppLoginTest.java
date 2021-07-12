package com.app.TestCases;

import org.openqa.selenium.By;


import java.util.concurrent.TimeUnit;

import javax.annotation.Nonnull;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.app.Utilities.BrowserFactory;
import com.app.Utilities.ConfigReader;

public class AppLoginTest
{
    
    public static BrowserFactory browser;
	public static ConfigReader config;
    public static WebDriver Dr;
    
	@BeforeSuite

	public void setupsuite() {
		
		config=new ConfigReader();
		browser=new BrowserFactory();
		
	}
	
	@BeforeTest
	public void launchbrowser() {
		Dr = browser.getbrowser("chrome", "http://www.mycontactform.com");
	}
	
	@Test
    public void verifytest()
    {
		
    }

	@AfterTest
	
	public void closebrowser() {
		browser.closebrowser();
	}


}
