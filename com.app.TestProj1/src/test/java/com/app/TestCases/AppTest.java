package com.app.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AppTest 
{
    public static WebDriver Dr;
    public static String appurl="mycontactform.com";
	
	
	
	@Test
    public void verifytest()
    {
    	System.out.println("hellooooooooooooooooooooooooooooooo");
    	System.out.println("hellooooooooooooooooooooooooooooooo");
    	System.out.println("hellooooooooooooooooooooooooooooooo");
    	
		System.setProperty("webdriver.chrome.driver", "C:\\ksr\\SeleniumJarFiles\\chromedriver.exe");
		Dr=new ChromeDriver();
		Dr.get(appurl);
		Dr.manage().window().maximize();
    	
    }
}
