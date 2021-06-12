package com.app.Utilities;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory
{
  public static WebDriver Dr;
  public static ConfigReader reader;
  
  public static void getDriver(String browsername, String appurl) {
	  
	  if(browsername.equals("chrome")) {
		  
		  System.setProperty(reader.getsystemproperty(), reader.getbrowserpath());
		  Dr=new ChromeDriver();
		  //Dr.navigate().to(appurl);
	  }
  
	  else if(browsername.equals("firefor"))
		  
	  {
		  System.setProperty("webdriver.gecko.driver", "./app.Drivers/geckodriver.exe");
		  Dr=new FirefoxDriver();

	  }
	 
  
  
  
  
  }
	
	
}
