package com.bala.testlabs.interfaces;

import org.openqa.selenium.WebDriver;

import com.bala.testlabs.factoryclasses.DriverFactory;

public interface DriverManager {
	
	String DOWNLOAD_PATH = "";
	String DRIVER_NAME = "";
	String URL = "";
	
	WebDriver createDriver();
	
	default void loadURL() {
		DriverFactory.getDriver(DRIVER_NAME).get(URL);
	}
}
