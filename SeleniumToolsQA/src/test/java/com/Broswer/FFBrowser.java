package com.Broswer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mkavy\\git\\SeleniumPractice\\SeleniumToolsQA\\src\\test\\java\\com\\BrowserJars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shop.demoqa.com");
		System.out.println("Successfully lanched the URL");
		

	}

}
