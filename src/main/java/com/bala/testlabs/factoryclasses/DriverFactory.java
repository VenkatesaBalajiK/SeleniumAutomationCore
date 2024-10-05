package com.bala.testlabs.factoryclasses;

import org.openqa.selenium.WebDriver;

import com.bala.testlabs.implementation.ChromeDriverManager;
import com.bala.testlabs.implementation.EdgeDriverManager;
import com.bala.testlabs.implementation.FirefoxDriverManager;

public class DriverFactory {

	private DriverFactory() {
		super();
	}

	public static WebDriver getDriver(String browserName) {

		switch (browserName.toLowerCase().trim()) {
		
		case "chrome":
			ChromeDriverManager chromeDriverManager = new ChromeDriverManager();
			return chromeDriverManager.createDriver();
			
		case "firefox":
			FirefoxDriverManager firefoxDriverManager = new FirefoxDriverManager();
			return firefoxDriverManager.createDriver();
			
		case "edge":
			EdgeDriverManager edgeDriverManager = new EdgeDriverManager();
			return edgeDriverManager.createDriver();

		default:
			throw new IllegalArgumentException("Invaild value for browser");
		}
	}

}
