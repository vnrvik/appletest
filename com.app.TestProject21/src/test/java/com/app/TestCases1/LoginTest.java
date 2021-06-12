package com.app.TestCases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
 public static WebDriver Dr;
	
	@Test
  public void verifytest() {
	  
	  System.setProperty("webdriver.chrome.driver", "./app.Drivers/chromedriver.exe");
	  Dr=new ChromeDriver();
	  Dr.navigate().to("mycontactform.com");
	  
  }
}
