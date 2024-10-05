package com.bala.testlabs.implementation;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.bala.testlabs.interfaces.DriverManager;

public class ChromeDriverManager implements DriverManager {

	@Override
	public WebDriver createDriver() {
		ChromeOptions options = getChromeOptions();
		return new ChromeDriver(options);
	}

	private ChromeOptions getChromeOptions() {
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--remote-allow-origins=*");
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--allow-insecure-localhost");
//	    chromeOptions.addArguments("--unsafely-treat-insecure-origin-as-secure="+url);
//	    chromeOptions.addArguments("--incognito");
//	    chromeOptions.addArguments("--test-type");
//	    chromeOptions.addArguments("--no-sandbox");
//	    chromeOptions.addArguments("--ignore-certificate-errors");
//	    chromeOptions.addArguments("--disable-popup-blocking");
//	    chromeOptions.addArguments("--disable-default-apps");
//	    chromeOptions.addArguments("--disable-extensions-file-access-check");
//	    chromeOptions.addArguments("--disable-infobars");
//	    chromeOptions.addArguments("--disable-gpu");
//	    chromeOptions.addArguments("-disable-extensions");
//	    chromeOptions.addArguments("--disable-dev-shm-usage");
//	    chromeOptions.addArguments("--window-size=1920,1080");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("download.default_directory", DOWNLOAD_PATH);
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromeOptions.setExperimentalOption("prefs", chromePrefs);
		return chromeOptions;
	}
}
