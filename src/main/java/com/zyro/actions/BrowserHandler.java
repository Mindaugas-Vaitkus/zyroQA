package com.zyro.actions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserHandler {
	
	public static void switchBetweenTabs(WebDriver driver, int tabNumber) {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(tabNumber - 1));
	}

	public static void navigateToURL(WebDriver driver, String URL) {
		String actionCase = AutoMethod.getCurrentMethodAndClassName();
		
		if (URL.isEmpty() || URL == null) {
			Assert.fail("\n *** Error in action <" + actionCase + ">. \n *** URL length is either 0 or null! \n");
		} else {
			driver.navigate().to(URL);
		}
	}
}