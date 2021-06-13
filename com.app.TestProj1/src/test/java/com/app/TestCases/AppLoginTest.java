package com.app.TestCases;

import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AppLoginTest 
{
    public static WebDriver Dr;
    //public static String appurl="mycontactform.com";
	
	
	
	@Test
    public void verifytest()
    {
    	System.out.println("hellooooooooooooooooooooooooooooooo");
    	System.out.println("hellooooooooooooooooooooooooooooooo");
    	System.out.println("hellooooooooooooooooooooooooooooooo");
    	
		System.setProperty("webdriver.chrome.driver", "C:\\ksr\\SeleniumJarFiles\\chromedriver.exe");
		Dr=new ChromeDriver();
		Dr.navigate().to("http://www.mycontactform.com");
		Dr.manage().window().maximize();
		
		Dr.findElement(By.name("user")).sendKeys("user1");
		Dr.findElement(By.name("pass")).sendKeys("pwd1");
		Dr.findElement(By.name("btnSubmit")).submit();
    
    
    }
}
