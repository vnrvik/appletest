package com.app.Utilities;

import java.io.File;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ConfigReader{
	public static Properties prop;
	public ConfigReader() {
	
try {
	
	File login=new File("./app.Files/login.properties");
	FileInputStream fis=new FileInputStream(login);
	prop=new Properties();
	prop.load(fis);
}catch(Exception e) {
	System.out.println(e.getMessage());
}
finally {
	System.out.println("file loaded successfully");
	
}
}
	//methods created for properties
public String getsystemproperty() {
	
	return prop.getProperty("chromedriver");
	
}

public String getbrowserpath() {
	
	return prop.getProperty("browserpath");
}
public String getbrowsername() {
	
	return(prop.getProperty("browsername"));
}

public String getbrowserurl() {
	
	return(prop.getProperty("browserurl"));
}

}
