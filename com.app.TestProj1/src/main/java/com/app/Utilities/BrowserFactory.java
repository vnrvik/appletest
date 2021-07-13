package com.app.Utilities;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	public static ConfigReader config;
	public static WebDriver Dr;
	
	public WebDriver getbrowser(String browsername, String appurl) {
		
		config=new ConfigReader();
	
	
	if(browsername.equals("chrome")) {
			System.setProperty(config.getsystemproperty(), config.getbrowserpath());
			Dr=new ChromeDriver();
		}
			
		else
			if(browsername.equals("edge")) {
				System.setProperty("webdriver.gecko.driver", "./app.Drivers/geckodriver.exe");
				Dr=new FirefoxDriver();
	
			}
		Dr.get(appurl);
	return Dr;
	
	}
	public void closebrowser() {
		
		Dr.close();
	}}
