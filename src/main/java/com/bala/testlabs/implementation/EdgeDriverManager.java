package com.bala.testlabs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.bala.testlabs.interfaces.DriverManager;

public class EdgeDriverManager implements DriverManager{

	@Override
	public WebDriver createDriver() {
		return new EdgeDriver();
		
	}
}
