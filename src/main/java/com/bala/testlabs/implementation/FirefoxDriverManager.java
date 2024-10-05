package com.bala.testlabs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bala.testlabs.interfaces.DriverManager;

public class FirefoxDriverManager implements DriverManager {

	@Override
	public WebDriver createDriver() {
		return new FirefoxDriver();
	}
}
