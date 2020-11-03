package com.nhance.automation.webGenericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NHANCEWebDriver {

	private WebDriver driver;
	private String region;

	public NHANCEWebDriver(WebDriver driver, String region) {
		driver = new FirefoxDriver();
		this.region = region;
	}

	public WebDriver getdriver() {
		if (driver == null) {
			driver = new FirefoxDriver();
			return driver;
		} else {
			return driver;
		}

	}
	
	public String getRegion() {
		return this.region;
	}
}
